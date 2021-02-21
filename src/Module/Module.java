package Module;

import java.util.Scanner;

public class Module {
	public static Scanner sc=new Scanner(System.in);
	protected static int nun;
	public static int a[]=new int[] {7,9,13,1,15,11,17,19};
	public static int b[]=new int[5];
	public static int[] c = new int[a.length + 5];

public Module() {
	
	for(int i=0;i<b.length;i++) {
		System.out.println("请输入长度为5的数组"+(i+1)+"下标数组b内容:");
		int num=sc.nextInt();
		b[i]=num;
	}
 System.out.print("请输入查入到数组的位置:");
		int nun=sc.nextInt();
		if(nun>8||nun<0) {
			System.out.println("你输入有误,请重新输入0-8的数字");
			nun=sc.nextInt();
		}
		
		for(int j=0;j<a.length;j++) {//a数组存入c数组中
			c[j]=a[j];
		}
		for(int k=c.length-1;k>=nun+5;k--) {//插入的数组后移5个单位5=b数组的长度
			c[k]=c[k-5];
		}

		for(int j=0;j<b.length;j++) {//b数组存入c数组
			c[j+nun]=b[j];

		}
	}
}

