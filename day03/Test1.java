import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int age=sc.nextInt();
		
		
		if(age<1||200<=age) {
			System.out.println("���̸� �ùٸ����Է��ϼ̴��� Ȯ�κ�Ź�帳�ϴ�!");
		}
		else {
			int fare=0;
			if(9<=age && age<=19) {
				fare=800;
				System.out.println(fare+"���Դϴ�.");
			}
			else if(20<=age && age<=64) {
				fare=1300;
				System.out.println(fare+"���Դϴ�.");
			}
			else {
				System.out.println(fare+"���Դϴ�.");
			}
		}
		
		
	}

}
/*
1.�ùٸ������� �����Է�
-> ��ȿ���˻�

2.~~���� ���� ����� if�������� ��ġ

3.else �߰�

4. => "�ϳ��� ���ǽ�"���� ����

5. => or [��ø]
*/