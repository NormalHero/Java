import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int age;
		do {
			System.out.print("나이입력: ");
			age=sc.nextInt();
			if(age<1 || 200<age) {
				System.out.println("올바르지않은값입니다!");
			}
		} while(age<1 || 200<age);
		System.out.println();
		if(age<20) {
			System.out.println("청소년입니다!");
		}
		else {
			System.out.println("성인입니다!");
		}
		
	}

}
