package com.ujiuye.quanxian;

public class TestQuanXian {

	public static void main(String[] args) {
		// 1. 默认权限可以在本包中使用
        System.out.println(new 默认权限Class().i);
        // 2. 受保护前线可以在本包中使用
        System.out.println(new 受保护权限Class().pro);
	}

}
