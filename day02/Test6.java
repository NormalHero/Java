import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// [���]
		// ���ǹ�   vs   �ݺ���

		// ���ǹ�
		// ~~�Ҷ�,���� ~~���,�б���,��������

		// �ݺ���
		// ������ ����,Nȸ,x��,�����ϰ�,Ư�������� �����Ҷ����� ���


		// [���ǹ�]
		// if  vs  switch

		/*
		if(���ǽ�) {
			�ش����ǽ��� T���,
			{}���� �ڵ�� ���డ��
		}
		 */

		Scanner sc=new Scanner(System.in);
		/*
		System.out.print("�����Է�: ");
		int num=sc.nextInt();

		if(num%2==0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
		 */

		int n1,n2;
		System.out.print("����1 �Է�: ");
		n1=sc.nextInt();
		System.out.print("����2 �Է�: ");
		n2=sc.nextInt();

		
		if(n1==n2) {
			System.out.println("�������� ũ�Ⱑ �����ϴ�.");
		}
		else if(n1>n2) { // �б��� �߰�
			System.out.println(n1+" Ȯ��1");
		}
		else {
			System.out.println(n2+" Ȯ��2");
		}














	}

}
