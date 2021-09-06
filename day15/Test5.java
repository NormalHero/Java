import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Exception myExcep=new Exception("범위외입력");

		// 일부러 예외를 만들어야하는 상황
		//  -> throw

		Scanner sc=new Scanner(System.in);

		try {
			System.out.print("나이입력: ");
			int age=sc.nextInt();

			if(age<=0 || 200<=age) {
				throw myExcep;
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}







	}

}
