package com.ujiuye.homework;
//���������
import java.util.Random;
public class HomeWork02 {
	public static void main(String[] args) {
		//�������������
		Random s = new Random();
		//��������Ϊ52��Sting��������
		String[] card = new String[52];
		//����A~K������
		String[] leter = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		//�����ң�����Ƭ
		String[] arr = {"����","����","÷��","��Ƭ"};
		//��¼card�±�
		int q=0 ;
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0 ; j<leter.length ; j++) {
				card[q++] = arr[i]+leter[j];
				System.out.print(card[q-1]+" ");
			}
			System.out.println("\n");
			
		}
		
		/*for (String m : card) {
			System.out.println(m);
		}*/
		int[] randnu = new int[] {-1,-1,-1};
		
		//i randnu���±�
		for(int i  = 0 ; i<randnu.length; i++) {
			q= s.nextInt(52);
			//�ж��ظ�����
			int x =0;
			for(int j = 0 ;j<randnu.length  ;j++) {
				/*System.out.println("��ǰ�����±�"+i);
				System.out.println("�������"+q);
				System.out.println("�Ƚ��±�ֵ"+randnu[j]);*/
				if(randnu[j] == q  ) {
					x++;
				}
			}
			//System.out.println("�鵽��"+(q+1)+"��"+card[q]);
			if(x==0) {
			randnu[i]=q;
			System.out.println("w"+randnu[i]);
			}else {
				i--;
			}
		}
		//��ȡ�������±�����
		for(int i= 0 ;i<randnu.length ;i++) {
			for(int j = 0 ;j<randnu.length-1-i ;j++)
			if(randnu[j] >randnu[j+1]) {
				randnu[j] = randnu[j]^randnu[j+1];
				randnu[j+1] = randnu[j]^randnu[j+1];
				randnu[j] = randnu[j]^randnu[j+1];		
			}
		}
		for(int i  = 0 ; i<randnu.length; i++) {
			System.out.println("�鵽��"+(randnu[i]+1)+"��"+card[randnu[i]]);
		}
		
		
		
	}
}
