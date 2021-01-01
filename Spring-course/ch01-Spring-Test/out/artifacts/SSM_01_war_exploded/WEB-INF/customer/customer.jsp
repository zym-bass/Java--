<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312">
    <title>客户信息管理</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/skin/css/base.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/skin/js/theAlert.css">
    <script src="${pageContext.request.contextPath}/skin/js/theAlert.js"></script>
    <script src="${pageContext.request.contextPath}/skin/js/jquery-3.4.1.js"></script>
    <script>
        function get_date(data) {
            var date = new Date(data);
            var year = date.getFullYear();
            var month = date.getMonth() + 1;
            var day = date.getDate();
            return year + "-" + month + "-" + day;
        };

        function selectAll() {
            var $allInputs = $("input[name=id][type=checkbox]");
            for (var i = 0; i < $allInputs.length; i++) {
                $allInputs[i].checked = true;
            }
            ;
        };

        function unSelectAll() {
            var $allInputs = $("input[name=id][type=checkbox]:checked");
            for (var i = 0; i < $allInputs.length; i++) {
                $allInputs[i].checked = false;
            }
            ;
        };

        //首页
        function firstPage() {
            showData(1,selectType,keyword,orderby);
        };

        //上一页
        function prePage(currentPage){
            if(currentPage>1){
                showData(currentPage-1,selectType,keyword,orderby);
            }else {
                showData(1,selectType,keyword,orderby);
            };
        };
        //下一页
        function nextPage(currentPage,totalPage){
            if(currentPage<totalPage){
                showData(currentPage+1,selectType,keyword,orderby);
            }else {
                showData(totalPage,selectType,keyword,orderby);
            };
        };

        //尾页
        function lastPage(totalPage) {
            showData(totalPage,selectType,keyword,orderby);
        };
        var selectType;
        var keyword;
        var orderby;
        //查询
        function searchCustomer(){
            selectType = $("#selectType").val();
            keyword = $("#keyword").val();
            orderby = $("#orderby").val();
            showData(1,selectType,keyword,orderby);
        };

        /*当页面加载完成*/
        $(function () {
            showData(1,selectType,keyword,orderby)
        });

        function showData(currentPage,selectType,keyword,orderby) {


            $.ajax({
                url: "${pageContext.request.contextPath}/cus/getCustomers",
                type: "post",
                data: {"currentPage": currentPage,"selectType": selectType,"keyword": keyword,"orderby": orderby},
                dataType: "json",
                cache: false,
                success: function (rs) {
                    $("#content tr:not(:lt(2)):not([id=showData])").remove();
                    $.each(rs.records, function (index, element) {
                        var tr = "\n" +
                            "<tr align='center' bgcolor=\"#FFFFFF\" onMouseMove=\"javascript:this.bgColor='#FCFDEE';\" onMouseOut=\"javascript:this.bgColor='#FFFFFF';\" height=\"22\" >\n" +
                            "\t<td><input name=\"id\" type=\"checkbox\" id=\"id\" value=\""+element.id+"\" class=\"np\"></td>\n" +
                            "\t<td>" + element.id + "</td>\n" +
                            "\t<td>" + element.companyperson + "</td>\n" +
                            "\t<td align=\"center\">" + element.comname + "</td>\n" +
                            "\t<td>" + get_date(element.addtime) + "</td>\n" +
                            "\t<td>" + element.comphone + "</td>\n" +
                            "\t<td><a href=\"customer-edit.jsp\">编辑</a> | <a href=\"customer-look.jsp\">查看详情</a></td>\n" +
                            "</tr>\n";
                        $("#showData").before(tr);
                    });
                    var showCutPageData="<tr align=\"right\" bgcolor=\"#EEF4EA\">\n" +
                        "\t<td height=\"36\" colspan=\"12\" align=\"center\">\n" +
                        "        <a href=\"javascript:firstPage();\">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "        <a href=\"javascript:prePage("+rs.currentPage+");\">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "        <a href=\"javascript:nextPage("+rs.currentPage+","+rs.totalPage+");\">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;\n" +
                        "        <a href=\"javascript:lastPage("+rs.totalPage+");\">尾页</a>\n" +
                        "    </td>\n" +
                        "</tr>";
                    $("#showData").after(showCutPageData);
                }
            });
        }


        function deleteCustomer(){

            var oSelectCustomer= $("input[name=id][type=checkbox]:checked");
            alert(oSelectCustomer.length);
            if(oSelectCustomer.length==0){

                theAlert("至少要选择一条记录进行删除","alert");
            }else{
                var ids=new Array();
                for(var i=0;i<oSelectCustomer.length;i++){
                    alert(oSelectCustomer[i].value);
                    ids.push(oSelectCustomer[i].value);
                }
                theAlert("您确定要删除这些记录吗?","confirm",function(bol){
                    if(bol){
                        $.ajax({
                            url:"${pageContext.request.contextPath}/cus/deleteCustomer",
                            type:"post",
                            data:{"ids":ids},
                            dataType:"json",
                            cache:false,
                            success:function(rs){
                                if(rs.status==200){
                                    window.location="${pageContext.request.contextPath}/cus/customer";
                                }else if(rs.status==400){
                                    theAlert(rs.msg,"alert");
                                }
                            }
                        });
                    }
                });

            }

        }

    </script>

</head>
<body leftmargin="8" topmargin="8"
      background='${pageContext.request.contextPath}${pageContext.request.contextPath}/skin/images/allbg.gif'>

<!--  快速转换位置按钮  -->
<table width="98%" border="0" cellpadding="0" cellspacing="1" bgcolor="#D1DDAA" align="center">
    <tr>
        <td height="26" background="${pageContext.request.contextPath}/skin/images/newlinebg3.gif">
            <table width="58%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td>
                        当前位置:客户信息管理>>客户信息
                    </td>
                    <td>
                        <input type='button' class="coolbg np" onClick="location='${pageContext.request.contextPath}/cus/customer-add';" value='添加客户信息'/>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>

<!--  搜索表单  -->
<form name='form3' action='' method='get'>
    <input type='hidden' name='dopost' value=''/>
    <table width='98%' border='0' cellpadding='1' cellspacing='1' bgcolor='#CBD8AC' align="center"
           style="margin-top:8px">
        <tr bgcolor='#EEF4EA'>
            <td background='${pageContext.request.contextPath}/skin/images/wbg.gif' align='center'>
                <table border='0' cellpadding='0' cellspacing='0'>
                    <tr>
                        <td width='90' align='center'>搜索条件：</td>
                        <td width='160'>
                            <select id='selectType' style='width:150px'>
                                <option value='0'>选择类型...</option>
                                <option value='1'>客户所在公司名称</option>
                                <option value='2'>联系人姓名</option>
                            </select>
                        </td>
                        <td width='70'>
                            关键字：
                        </td>
                        <td width='160'>
                            <input type='text' id='keyword' name='keyword' value='' style='width:120px'/>
                        </td>
                        <td width='110'>
                            <select id='orderby' name='orderby' style='width:120px'>
                                <option value='0'>排序...</option>
                                <option value='1'>添加时间升序</option>
                                <option value='2'>添加时间降序</option>
                            </select>
                        </td>
                        <td>
                            &nbsp;&nbsp;&nbsp;
                            <a href="javascript:searchCustomer();">
                                <img src="${pageContext.request.contextPath}/skin/images/frame/search.gif" width="45" height="20" border="0" alt="">
                            </a>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</form>
<!--  内容列表   -->
<form name="form2" id="content">

    <table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center"
           style="margin-top:8px">
        <tr bgcolor="#E7E7E7">
            <td height="24" colspan="12" background="${pageContext.request.contextPath}/skin/images/tbg.gif">&nbsp;需求列表&nbsp;</td>
        </tr>
        <tr align="center" bgcolor="#FAFAF1" height="22">
            <td width="4%">选择</td>
            <td width="6%">序号</td>
            <td width="10%">联系人</td>
            <td width="10%">公司名称</td>
            <td width="8%">添加时间</td>
            <td width="8%">联系电话</td>
            <td width="10%">操作</td>
        </tr>


        <tr bgcolor="#FAFAF1" id="showData">
            <td height="28" colspan="12">
                &nbsp;
                <a href="javascript:selectAll();" class="coolbg">全选</a>
                <a href="javascript:unSelectAll();" class="coolbg">反选</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <a href="javascript:deleteCustomer();" class="coolbg">&nbsp;删除&nbsp;</a>
                <a href="" class="coolbg">&nbsp;导出Excel&nbsp;</a>
            </td>
        </tr>

    </table>

</form>


</body>
</html>