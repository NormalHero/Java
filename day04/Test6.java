import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// for��
		/*
		int i;
		for(i=1;i<=3;i++) {
			System.out.println("�ȳ��ϼ���!");
		}
		System.out.println("���� i= "+i);

		for(int i=1;i<=3;i++) {
			System.out.print(i+" ");
		}
		 */
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=1;i<=50;i++) {
			if(i%3!=0) {
				continue; // for�������� "���" ���������� �̵�
			}
			System.out.print(i+" ");			
		}
		System.out.println();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;	
		}
		System.out.println("1���� "+num+"������ ������ "+sum+"�Դϴ�.");
		System.out.println();
		System.out.println();
		sum=0;
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"��° �����Է�: ");
			int n=sc.nextInt();
			sum+=n;
		}
		double avg=sum/10.0;
		System.out.println("������ "+sum+"�̰�, ����� "+avg+"�Դϴ�.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
