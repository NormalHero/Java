import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// [����.Exception]
		// ������ ������ ������, ������ �����ϴ� �������� ������ �߻��ϴ� ���
		// ���ܹ߻���, ���α׷��� ��� ���� == ���α׷��� ������ ����xxx

		Scanner sc=new Scanner(System.in);


		// ���ܰ� �߻��ص�, ���α׷��� ������ �����Ű��ʹ�!
		// "����ó��"
		// -> try-catch��

		int a=10,b=1;
		try { // ���ܰ� �߻��Ҽ����ִ� �ڵ带 �ۼ��ص�
			System.out.println("ȫ�浿");
			
			System.out.println(a/b); // ���ܹ߻���!
			// ���ܰ� �߻��ϸ�, try���� �������ǰ�
			// �ش� ���ܿ� �˸´� catch���� �����ϰԵ�
			
			System.out.println("�Ӳ���");
		}
		catch(ArithmeticException e) { // ���ܰ� �߻�������, ��� ó������ �ۼ�
			// � ���ܿ� ���ؼ� ó���� ������, ()�ȿ� ���
			// catch���� ������ �ۼ��Ҽ�����
			System.out.println("���ܹ߻�!");
		}


		System.out.println("���α׷� ����");

	}

}
