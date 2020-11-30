package com.yiming.service;

import com.yiming.dao.ShengHuiDao;
import com.yiming.entity.Province;

public class ShengHuiService {
    private static ShengHuiDao shd =  new ShengHuiDao();
    //查询省会名
    public String queryshenghui(Integer sno){
        return shd.queryName(sno);
    }
    public Province query(Integer sno){
        return shd.query(sno);
    }

}
