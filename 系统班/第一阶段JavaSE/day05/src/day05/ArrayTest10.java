package day05;

public class ArrayTest10 {
	public static void main(String []  args) {
		
		//
		String[] s0={};
		System.out.println(s0.length);//0
		String[] s1={null,null};
		System.out.println(s1.length);//2
		String[] s2=new String[2];
		System.out.println(s2.length);//2
		/*String[] s3=null;
		System.out.println(s3.length);*///±¨´í
		String[] arr = {"42","efw","wfw","2"};
		for(String x : arr) {
			System.out.println(x);
		}
	}
}
