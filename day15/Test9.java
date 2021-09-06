import java.util.ArrayList;
import java.util.Scanner;

class MyException2 extends Exception{

	public MyException2() {
		super("범위외입력");
		// TODO Auto-generated constructor stub
	}

}
public class Test9 {

	public static void main(String[] args) {

		ArrayList<String> menu=new ArrayList();
		Scanner sc=new Scanner(System.in);

		System.out.println("==메뉴판 프로그램==");
		System.out.println();
		MyException2 myE=new MyException2();

		while(true) {
			try {
				System.out.println("1.추가 2.삭제 3.출력 4.종료");
				System.out.print("입력: ");
				int act=sc.nextInt();

				if(act==1) {
					sc.nextLine();
					System.out.print("메뉴이름입력: ");
					String name=sc.nextLine();
					menu.add(name);
					System.out.println("메뉴등록완료!");
				}
				else if(act==4) {
					break;
				}
				else {
					throw myE;
				}
			}
			catch(MyException2 e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println("정수를 입력해주세요!");
				sc.nextLine();
			}

			// 1. 1~4외의 입력에대해서 "범위외입력" => 예외를 발생시켜주세요!~~
			// 2. 잘못된 타입입력에 대해서 => "정수를 입력해주세요!"


		}

	}

}
