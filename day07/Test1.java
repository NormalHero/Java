import java.util.Scanner;

public class Test1 {

	static boolean func(int v) {
		
		//return v%2==1?true:false;
		//return v%2==1;
		
		if(v%2==1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		// main()���� ���� ���� 1���� �Է�
		// 0���� ���� ������ �ԷµǸ� �ٽ��Է�
		// 0�� �ԷµǸ� ���α׷� ����
		// 0���� ū ���� �Է� -> Ȧ/¦ �Ǻ��Լ� ȣ�� => Ȧ���� �����ּ���!~~
		// ���α׷��� ����Ǿ�����, ������ ���!

		Scanner sc=new Scanner(System.in);

		int res=0;
		while(true) {
			int v;
			do {
				System.out.print("�����Է�: ");
				v=sc.nextInt();
			}while(v<0);
			
			if(v==0) {
				break;
			}
			
			if(func(v)) {
				res+=v;
			}
		}
		System.out.println("������ "+res+"�Դϴ�.");


	}

}
