import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// [���ѷ���,���ѹݺ���]
		// 1. Ư�������� �����Ҷ����� ���
		//    -> while������ �����߿� �߻��Ҽ����ִ� ����!
		// 2. ������
		// "��������"�� �ڵ峻�� �ݵ�� �����ؾ���!!!		
		/*
		int i=0;
		while(true) {
			System.out.println(i);
			i++;
			if(i==1000) { // ��������
				break;
			}
		}
		System.out.println("��");
		*/
		Scanner sc=new Scanner(System.in);
		/*
		int sum=0;
		while(true) {
			System.out.print("�����Է�: ");
			int num=sc.nextInt();
			
			if(num==0) { // ��������
				break;
			}
			sum+=num;
		}
		System.out.println("������ "+sum+"�Դϴ�.");
		
		int sum=0;
		while(true) {
			System.out.print("�����Է�: ");
			int num=sc.nextInt();
			
			if(num==0) {
				break;
			}
			else if(num<0) {
				num*=(-1);
			}
			sum+=num;
		}
		*/
		while(true) {
			System.out.print("�����Է�: ");
			int num=sc.nextInt();
			
			if(num<0) {
				break;
				// �ݺ����� "���" �����Ű�� Ű����
				// "��������"�� �����Ҷ��� �ַ� �̿�
			}
			
			if(num%2==0) {
				continue;
				// �ݺ����� ������ "���" �ߴ��ϰ�,
				// �ش� �ݺ����� ó��(while���� ���ǽ�)���� �̵��ϴ� Ű����
			}			
			System.out.println(num);
		} // Ȧ���̸�, ������ּ���!
		// => ¦�����, �������������!
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
