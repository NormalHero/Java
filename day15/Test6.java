import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Exception myE=new Exception("0~10까지만 입력해주세요!");

		int num=10;

		while(true) {
			try {
				System.out.print("정수입력: "); // 0~10까지만 입력가능
				int n=sc.nextInt();

				// 1. 범위외입력 => "0~10까지만 입력해주세요!"
				// 2. 0 => 0으로는 나눌수없습니다!
				// 3. 3.14 => "정수만 입력해주세요!"

				if(n<0 || 10<n) {
					throw myE;
				}



				System.out.println(num/n);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로는 나눌수없습니다!");
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력해주세요!");
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
