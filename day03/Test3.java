import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		// ����(����)�Է�: (0~100)
		// �߸��� �����Է��Դϴ�!
		// 0~50: F
		// 51~60: C
		// 61~80: B
		// 81~100: A
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int score=sc.nextInt();
		
		if(score<0 || 100<score) {
			System.out.println("�߸��� �����Է��Դϴ�!");
		}
		else {
			if(score<=50) {
				System.out.println("F");
			}
			else if(score<=60) {
				System.out.println("C");
			}
			else if(score<=80) {
				System.out.println("B");
			}
			else {
				System.out.println("A");
			}
		}
		
		
		
		
		
		
	}

}
