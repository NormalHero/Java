import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int arr[]={10,11,2,0,5};


		while(true) {
			
			try {
				System.out.print("����1�Է�: ");
				int num1=sc.nextInt();
				System.out.print("����2�Է�: ");
				int num2=sc.nextInt();
				System.out.println(arr[num1] / arr[num2]);
				
				
				
				break;
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				System.out.println("0���δ� �����⸦ �����Ҽ������ϴ�!");
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.print(e.getMessage());
				System.out.println(" �ش��ε����� �����ϴ�!");
			}
			catch(Exception e) {
				System.out.println("Ÿ�԰��� ���ܹ߻�!");
				sc.nextLine();
			}
			finally { // ���ܹ߻����ο� ������� �׻� ������
				System.out.println("��");
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

		System.out.println("���α׷� ����");
		 */

	}

}
