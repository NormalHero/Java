import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[]={10,11,2,0,5};


		while(true) {
			
			try {
				System.out.print("정수1입력: ");
				int num1=sc.nextInt();
				System.out.print("정수2입력: ");
				int num2=sc.nextInt();
				System.out.println(arr[num1] / arr[num2]);
				
				
				
				break;
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("0으로는 나누기를 진행할수없습니다!");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.print(e.getMessage());
				System.out.println(" 해당인덱스가 없습니다!");
			}
			catch(Exception e) {
				System.out.println("타입관련 예외발생!");
				sc.nextLine();
			}
			finally { // 예외발생여부에 관계없이 항상 수행함
				System.out.println("★");
			}


		}
		/*
		int arr[]= {123,2,3,4,5};


		try {
			System.out.println(arr[5]);

			int num=10/0;			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(arr[0]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료");
		 */

	}

}
