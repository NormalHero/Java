import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// switch��
		/*
		switch(���� / ��) {
		case 1:
			///
		case 2:
			///
		case 3:
			///	
		}		
		*/
		/*
		int i=3;
		
		switch(i) {
		case 1:
			System.out.println("�ϳ�!");
			//break;
		case 2:
			System.out.println("��!");
			break;
		case 3:
			System.out.println("��!");
			break;
		default:
			System.out.println("�ش����");	
		}
		
		
		
		
		
		System.out.print("�����Է�: ");
		int num=sc.nextInt();
		
		switch(num%2) {
		case 0:
			System.out.println("¦��");
			break;
		case 1:
			System.out.println("Ȧ��");
		}
		
		*/
		
		System.out.print("���� �Է��ϼ���.  ");
		int month=sc.nextInt();
		String w;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			w="�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			w="��";
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			w="����";
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			w="����";
			break;
		default:
			System.out.println("��ȿ�������� ���Է��Դϴ�!");
			w="��ȿ�������� ��";
		}
		
		
		System.out.println(w+" �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
