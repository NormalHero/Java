import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("정수1 입력: ");
		int num1=sc.nextInt();
		System.out.print("정수2 입력: ");
		int num2=sc.nextInt();
/*
		if(num1<num2) {
			int i=num1;
			while(i<=num2) {
				System.out.print(i+" ");
				i++;
			}
		}
		else {
			int i=num2;
			while(i<=num1) {
				System.out.print(i+" ");
				i++;
			}
		}

		int min=num1<num2?num1:num2;
		int max=num1>num2?num1:num2;
		int i=min;
		while(i<=max) {
			System.out.print(i+" ");
			i++;
		}
*/
		if(num1>num2) {
			// [교환] 알고리즘
			//  -> "임시저장변수": tmp,temp
			int tmp=num1;
			num1=num2;
			num2=tmp;
		}
		int i=num1;
		while(i<=num2) {
			System.out.print(i+" ");
			i++;
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
