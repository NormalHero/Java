import java.util.Scanner;

public class Test4 {
	
	static void func1(){
		System.out.println("�ȳ��ϼ���!~~");
	} // �Լ��� �����ߴ�.
	
	static void func2(int i) {
		i+=2;
		System.out.println("func2()�Լ� ȣ���!");
		System.out.println("���� ������ ���� "+i+"�Դϴ�.");
		System.out.println();
	}
	
	static void swap(int a,int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		swap(a,b);
		System.out.println("a="+a+", b="+b);
		
		
		
		
		//func1();
		//func1();
		//func1(); // �Լ��� ȣ���ߴ�.
		/*
		int a=10;
		System.out.println("func2()ȣ����: a="+a);
		func2(a); // ��(value)�� ���ڿ� ������!!!!!
		System.out.println("func2()ȣ����: a="+a);
		//func2(0);
		//func2(-10);
		*/
		
		// [�Լ�]
		// => �ڵ��� ���뼺 ������
		// ����ڰ� �����ϴ� �Լ�
		
		// 1.input: �Է°�,����,�μ�,�Ű�����
		// 2.output: �����,���ϰ�,return,��ȯ��,��°�
		// 3.���
		
		// output �Լ���(input)
		/*
		for(String v:args) {
			System.out.println(v);
		}
		*/
		
		// input x  output x
		// input o  output x
		// input x  output o
		// input o  output o
		
	}

}
