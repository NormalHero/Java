import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�Ǽ�1 �Է�: ");
		double num1=sc.nextDouble();
		System.out.print("�Ǽ�2 �Է�: ");
		double num2=sc.nextDouble();
		System.out.print("�Ǽ�3 �Է�: ");
		double num3=sc.nextDouble();
		
		if(num1==num2 || num1==num3 || num2==num3) {
			System.out.println("������ ���� �߰��߽��ϴ�!");
		}
		else if(num1>num2 && num1>num3) {
			System.out.println("���� ū �Ǽ��� "+num1+"�Դϴ�.");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("���� ū �Ǽ��� "+num2+"�Դϴ�.");
		}
		else {
			System.out.println("���� ū �Ǽ��� "+num3+"�Դϴ�.");
		}
		
		/*
		else {
			System.out.print("���� ū �Ǽ��� ");
			if(num1>num2) {
				if(num1>num3) {
					System.out.print(num1);
				}
				else {
					System.out.print(num3);
				}
			}
			else {
				if(num2>num3) {
					System.out.print(num2);
				}
				else {
					System.out.print(num3);
				}
			}
			System.out.println("�Դϴ�.");
		}
		*/
	}

}
