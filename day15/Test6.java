import java.util.InputMismatchException;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		Exception myE=new Exception("0~10������ �Է����ּ���!");

		int num=10;

		while(true) {
			try {
				System.out.print("�����Է�: "); // 0~10������ �Է°���
				int n=sc.nextInt();

				// 1. �������Է� => "0~10������ �Է����ּ���!"
				// 2. 0 => 0���δ� �����������ϴ�!
				// 3. 3.14 => "������ �Է����ּ���!"

				if(n<0 || 10<n) {
					throw myE;
				}



				System.out.println(num/n);
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0���δ� �����������ϴ�!");
			}
			catch(InputMismatchException e) {
				System.out.println("������ �Է����ּ���!");
				sc.nextLine();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

		}
	}

}
