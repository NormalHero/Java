import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int num;
		do {
			System.out.print("번호를 입력하세요.  ");
			num=sc.nextInt();
			// 입력범위: 1~3
		}while(!(1<=num && num<=3));

		// while문: 선조건 후처리
		// do-while문: 선처리 후조건



	}

}
