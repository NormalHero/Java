import java.util.ArrayList;
import java.util.Scanner;

class MyException2 extends Exception{

	public MyException2() {
		super("�������Է�");
		// TODO Auto-generated constructor stub
	}

}
public class Test9 {

	public static void main(String[] args) {

		ArrayList<String> menu=new ArrayList();
		Scanner sc=new Scanner(System.in);

		System.out.println("==�޴��� ���α׷�==");
		System.out.println();
		MyException2 myE=new MyException2();

		while(true) {
			try {
				System.out.println("1.�߰� 2.���� 3.��� 4.����");
				System.out.print("�Է�: ");
				int act=sc.nextInt();

				if(act==1) {
					sc.nextLine();
					System.out.print("�޴��̸��Է�: ");
					String name=sc.nextLine();
					menu.add(name);
					System.out.println("�޴���ϿϷ�!");
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
				System.out.println("������ �Է����ּ���!");
				sc.nextLine();
			}

			// 1. 1~4���� �Է¿����ؼ� "�������Է�" => ���ܸ� �߻������ּ���!~~
			// 2. �߸��� Ÿ���Է¿� ���ؼ� => "������ �Է����ּ���!"


		}

	}

}
