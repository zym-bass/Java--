package com.ujiuye.other;

import com.ujiuye.quanxian.受保护权限Class;

public class 受保护子类 extends 受保护权限Class {
   // 子类中可以继承大到受保护权限, 但是仅仅只能在子类中使用
   // 受保护权限在外包的子类中, 相当于private私有使用
	public void usePro() {
		System.out.println(pro);
		System.out.println(super.pro);
	}
	
}
