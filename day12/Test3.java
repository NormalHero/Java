import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		String a="apple";
		String b="apple";
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ��Է�: ");
		b=sc.nextLine();
		
		if(a.equals(b)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ�");
		}
		
		
		// ���ڿ� Ŭ����(String)�� �ֻ��� Ŭ���� Object�� ��ӹ���
		// equals()�� �����ǵǾ��ִ� ����
		// -> �񱳿����� ���, equals() �޼��带 ���
		
		
	}

}
