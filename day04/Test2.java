import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int menu;
		do{
			System.out.println("===�޴� ����Ʈ===");
			System.out.println("1.�Ƹ޸�ī��");
			System.out.println("2.ī���");
			System.out.println("3.����Ǫġ��");
			System.out.print("�Է�: ");
			menu=sc.nextInt();
		}while(menu<1 || 3<menu);

		switch(menu) {
		case 1:
			System.out.print("�Ƹ޸�ī��");
			break;
		case 2:
			System.out.print("ī���");
			break;
		case 3:
			System.out.print("����Ǫġ��");
		}
		System.out.println(" ���Խ��ϴ�~!!");
		

	}

}
