import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.print("���Ϲ����Է�: ");
		char c=sc.nextLine().charAt(0);
		System.out.println("c= "+c);
		
		if(c=='C') {
			System.out.println("Ȯ��1");
		}
		
		switch(c) {
		case 'C':
			System.out.println("Ȯ��2");
		}
		
		
		System.out.print("���Է�: ");
		char color=sc.nextLine().charAt(0);
		
		switch(color) {
		case 'R':
		case 'r':
			System.out.println("����!");
			break;
		case 'Y':
		case 'y':
			System.out.println("����!");
			break;
		case 'G':
		case 'g':
			System.out.println("���!");
			break;
		default:
			System.out.println("���� ����Դϴ�!");
		}
		*/
		
		
		System.out.print("����1 �Է�: ");
		int num1=sc.nextInt();
		System.out.print("����2 �Է�: ");
		int num2=sc.nextInt();
		
		
		sc.nextLine(); // ��
			
		System.out.print("�������Է�: ");
		char op=sc.nextLine().charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(num1+num2);
			break;
		case '-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		default:
			System.out.println("�߸��� �������Դϴ�!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
