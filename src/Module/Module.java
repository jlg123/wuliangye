package Module;

import java.util.Scanner;

public class Module {
	public static Scanner sc=new Scanner(System.in);
	public static int nun;
	public static int a[]=new int[] {7,9,13,1,15,11,17,19};
	public static int b[]=new int[5];
	public static int[] c = new int[13];

public void Mod() {
	
	for(int i=0;i<b.length;i++) {
		System.out.println("�����볤��Ϊ5������"+(i+1)+"�±�����b����:");
		int num=sc.nextInt();
		b[i]=num;
	}
	
 System.out.print("��������뵽�����λ��:");
		 nun=sc.nextInt();
		if(nun>8||nun<0) {
			System.out.println("����������,����������0-8������");
			nun=sc.nextInt();
		}

		for(int j=0;j<a.length;j++) {//a�������c������
			c[j]=a[j];
		}
		for(int i=c.length-1;i>=nun+5;i--) {//������������5����λ5=b����ĳ���
			c[i]=c[i-5];
		}
		
		for(int j=0;j<b.length;j++) {//b�������c����
			c[j+nun]=b[j];

		}
	}
}

