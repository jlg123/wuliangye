package Controller;

import Module.Module;

public class Controller extends Module{
	

	public void Stor(){
	for(int i=0;i<c.length-1;i++) {//ð������,��c������н���
	for(int j=0;j<nun;j++) {
		if(c[j]<c[j+1]) {
			int temp =c[j];
			c[j]=c[j+1];
			c[j+1]=temp;
		}
	}
	
	}
	
	for(int j=0;j<c.length-1;j++) {//ð������,��nun�����������
	for(int i=nun;i<nun+5-1;i++) {
		if(c[i]>c[i+1]) {
			int temp=c[i];
			c[i]=c[i+1];
			c[i+1]=temp;
		}
		}
	}
	
	for(int i=0;i<c.length-1;i++) {
	for(int j=nun+5;j<c.length-1;j++) {//ð�������nun+5������������������
		if(c[j]>c[j+1]) {
			int temp =c[j];
			c[j]=c[j+1];
			c[j+1]=temp;
		}
	}
	}
	System.out.println();
	System.out.print("�����C:");
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+"\t");
	}
	}
}