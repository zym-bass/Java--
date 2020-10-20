package com.yiming.java1020.访问控制权限;
/*
* 1. 访问控制权限

    1. 访问控制权限都哪些？

        private 私有

        protectend 受保护

        public 公开

            默认

    1. 以上的4个访问控制权限，控制的范围是什么？

        private 表示私有的，只能在本类中访问

        public 表示公开的，在任何位置可以访问

        "默认"表示只能在本类，同包中访问

        protected表示只能在本类，同包，子类中访问。

|访问控制修饰符|本类|同包|子类|任意位置|
|-|-|-|-|-|
|public|可以|可以|可以|可以|
|protected|可以|可以|可以|不行|
|默认|可以|可以|不行|不行|
|private|可以|不行|不行|不行|


范围大到小：public > protected>默认>private*/
public class Test02 {

}
