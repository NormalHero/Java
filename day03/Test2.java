import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("실수1 입력: ");
		double num1=sc.nextDouble();
		System.out.print("실수2 입력: ");
		double num2=sc.nextDouble();
		System.out.print("실수3 입력: ");
		double num3=sc.nextDouble();
		
		if(num1==num2 || num1==num3 || num2==num3) {
			System.out.println("동일한 값을 발견했습니다!");
		}
		else if(num1>num2 && num1>num3) {
			System.out.println("가장 큰 실수는 "+num1+"입니다.");
		}
		else if(num2>num1 && num2>num3) {
			System.out.println("가장 큰 실수는 "+num2+"입니다.");
		}
		else {
			System.out.println("가장 큰 실수는 "+num3+"입니다.");
		}
		
		/*
		else {
			System.out.print("가장 큰 실수는 ");
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
			System.out.println("입니다.");
		}
		*/
	}

}
