import java.util.Scanner;

public class Test5 {

	static int func3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num=sc.nextInt();
		
		return num; // �ش� �Լ��� ȣ���� ��ġ�� ���� "���" �����ϴ� ����
	}
	
	static double function(){
		Scanner sc=new Scanner(System.in);
		System.out.print("�Ǽ�1 �Է�: ");
		double d1=sc.nextDouble();
		System.out.print("�Ǽ�2 �Է�: ");
		double d2=sc.nextDouble();
		double res=d1>d2? d1-d2:d2-d1;
		return res;
	}
	
	public static void main(String[] args) {
		
		
		//int a=func3();
		//int b=func3();
		
		//System.out.println("a= "+a);
		//System.out.println("b= "+b);
	
		
		double r=function();
		System.out.println("function()ȣ������ "+r+"�Դϴ�.");
		
	}

}
