import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�����Է�: ");
		int num=sc.nextInt();
		
		// ���ѹݺ���==���ѷ���  ->  �����ư���� �ܼ�����!!!
		
		int i=3;
		int cnt=0;
		while(i<=num) {
			
			if(i%3==0) {
				System.out.print(i+" ");
				cnt++;
			}
			
			i++;
		}
		System.out.println();
		System.out.println("3�� ����� ������ "+cnt+"���Դϴ�.");
		
		
	}

}
