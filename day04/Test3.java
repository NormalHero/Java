import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int age;
		do {
			System.out.print("�����Է�: ");
			age=sc.nextInt();
			if(age<1 || 200<age) {
				System.out.println("�ùٸ����������Դϴ�!");
			}
		} while(age<1 || 200<age);
		System.out.println();
		if(age<20) {
			System.out.println("û�ҳ��Դϴ�!");
		}
		else {
			System.out.println("�����Դϴ�!");
		}
		
	}

}
