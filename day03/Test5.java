import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.print("단일문자입력: ");
		char c=sc.nextLine().charAt(0);
		System.out.println("c= "+c);
		
		if(c=='C') {
			System.out.println("확인1");
		}
		
		switch(c) {
		case 'C':
			System.out.println("확인2");
		}
		
		
		System.out.print("색입력: ");
		char color=sc.nextLine().charAt(0);
		
		switch(color) {
		case 'R':
		case 'r':
			System.out.println("정지!");
			break;
		case 'Y':
		case 'y':
			System.out.println("주의!");
			break;
		case 'G':
		case 'g':
			System.out.println("출발!");
			break;
		default:
			System.out.println("없는 명령입니다!");
		}
		*/
		
		
		System.out.print("정수1 입력: ");
		int num1=sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2=sc.nextInt();
		
		
		sc.nextLine(); // ☆
			
		System.out.print("연산자입력: ");
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
			System.out.println("잘못된 연산자입니다!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
