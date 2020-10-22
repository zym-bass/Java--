package com.yiming.java1021;

public class StringTest02 {
    public static void main(String[] args){
        //String常用方法
        //1. char charAt(int index)
        char c = "中国人".charAt(1);//
        System.out.println(c);    //“国”

        //getBytes(Charset charset)
        //使用给定的 charset 将此 String 编码到 byte 序列，并将结果存储到新的 byte 数组。
        byte[] bytes = "eefew".getBytes();
        for(int i : bytes){
            System.out.println(i);
        }

        /*indexOf(String str)
        返回指定子字符串在此字符串中第一次出现处的索引。*/
        System.out.println("etjavaeiwfwkfowdofu".indexOf("java"));

        /*isEmpty()
        当且仅当 length() 为 0 时返回 true。*/
        String s ="";
        System.out.println(s.isEmpty());

       /* lastIndexOf(String str)
        返回指定子字符串在此字符串中最右边出现处的索引。*/
        System.out.println("etjavaeiwfwkfowdofujava".lastIndexOf("java"));

       /* replace(CharSequence target, CharSequence replacement)
        使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。*/
        String newString = "1231254345353".replace("123","111");
        System.out.println(newString);

        /*split(String regex, int limit)
        根据匹配给定的正则表达式来拆分此字符串。*/
        String[] yed  = "1980-10-11".split("-");
        for(String i : yed){
            System.out.println(i);
        }

        /*startsWith(String prefix, int toffset)
        测试此字符串从指定索引开始的子字符串是否以指定前缀开始。*/

        System.out.println("123455464".startsWith("12"));
        System.out.println("123455464".startsWith("124"));


        /*substring(int beginIndex)//beginIndex 开始下标
        返回一个新的字符串，它是此字符串的一个子字符串。*/
        System.out.println("http134253453ed".substring(7));

        /*toCharArray()
        将此字符串转换为一个新的字符数组。*/
        char[] chars = "wlfwlff".toCharArray();
        for(char s1 : chars){
            System.out.println(s);
        }

        /*toLowerCase()
        使用默认语言环境的规则将此 String 中的所有字符都转换为小写。*/
        String s2 = "FOSOFIfowff";
        System.out.println(s2.toLowerCase());

        /*toUpperCase()
        使用默认语言环境的规则将此 String 中的所有字符都转换为大写。*/
        System.out.println(s2.toUpperCase());

        /*trim()
        返回字符串的副本，忽略前导空白和尾部空白。*/
        System.out.println("  wew fw f wf w w w w w w  ".trim());

       /* valueOf(double d)
        返回 double 参数的字符串表示形式。*/
        String s1 = String.valueOf(true);//将（）里的值转换成字符串
        System.out.println(s1);

    }
}
