import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		Exception myExcep=new Exception("�������Է�");

		// �Ϻη� ���ܸ� �������ϴ� ��Ȳ
		//  -> throw

		Scanner sc=new Scanner(System.in);

		try {
			System.out.print("�����Է�: ");
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
