import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int i=sc.nextInt();
		
		System.out.println("�Է��Ͻ� ������ ["+i+"]�Դϴ�.");
		
		
		System.out.print("�Ǽ��Է�: ");
		double d=sc.nextDouble();
		
		System.out.println("�Է��Ͻ� �Ǽ��� ["+d+"]�Դϴ�.");	
				
		
		sc.nextLine(); // ���۰����� ���ʿ��� ���鰪(����Ű�Է�)�� ������
		System.out.print("���ڿ��Է�: ");
		String str=sc.nextLine();
		
		System.out.println("�Է��Ͻ� �ܾ�� ["+str+"]�Դϴ�.");
		
		
		
		
		
		
	}

}
