import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		// ���� ������ == ���� ������
		// ���ǽ� ? T:F
		/*
		int num=10<5 ? 100:200;
		System.out.println("num= "+num);
		*/
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.print("����1�Է�: ");
		int num1=sc.nextInt();
		System.out.print("����2�Է�: ");
		int num2=sc.nextInt();
		
		int res=num1>num2? num1:num2;		
		System.out.println(num1+"�� "+num2+"��, �� ū ������ "+res);
		*/
		
		int num;
		System.out.print("�����Է�: ");
		num=sc.nextInt();
		String str=  num%2==1 ? "Ȧ":"¦";
		System.out.println(str+"���Դϴ�.");
		
		
		
		
		
		
		
		double n1,n2,n3;
		System.out.print("�Ǽ�1�Է�: ");
		n1=sc.nextDouble();
		System.out.print("�Ǽ�2�Է�: ");
		n2=sc.nextDouble();
		System.out.print("�Ǽ�3�Է�: ");
		n3=sc.nextDouble();

		double min=n1<n2 ? n1:n2;
		min=min<n3 ? min:n3;
		System.out.println("���� ���� �Ǽ��� "+min+"�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		


	}

}
