import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// [예외.Exception]
		// 문법상 문제가 없으나, 실제로 수행하는 과정에서 문제가 발생하는 경우
		// 예외발생시, 프로그램이 즉시 종료 == 프로그램을 끝까지 수행xxx

		Scanner sc=new Scanner(System.in);


		// 예외가 발생해도, 프로그램을 끝까지 수행시키고싶다!
		// "예외처리"
		// -> try-catch문

		int a=10,b=1;
		try { // 예외가 발생할수도있는 코드를 작성해둠
			System.out.println("홍길동");
			
			System.out.println(a/b); // 예외발생함!
			// 예외가 발생하면, try문은 즉시종료되고
			// 해당 예외에 알맞는 catch문을 수행하게됨
			
			System.out.println("임꺽정");
		}
		catch(ArithmeticException e) { // 예외가 발생했을때, 어떻게 처리할지 작성
			// 어떤 예외에 대해서 처리할 것인지, ()안에 명시
			// catch문은 여러개 작성할수있음
			System.out.println("예외발생!");
		}


		System.out.println("프로그램 종료");

	}

}
