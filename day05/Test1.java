import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		/*
		for(int a=2;a<=9;a++) {
			for(int i=1;i<=9;i++) {
				System.out.println(a+" x "+i+" = "+a*i);
			}
			System.out.println("----------");
		}

		 ***** a=0,i=0 a=0,i=1 a=0,i=2 a=0,i=3 a=0,i=4
		 **** a=1,i=0 a=1,i=1 a=1,i=2 a=1,i=3
		 *** a=2,i=0 a=2,i=1 a=2,i=2  [a+i<5]
		 **
		 *



		for(int a=0;a<5;a++) {
			for(int i=0;i<5-a;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */
		Scanner sc=new Scanner(System.in);
		int cnt=5;
		int res=0;
		while(cnt>0) {
			System.out.print("�����Է�: ");
			int num=sc.nextInt();
			if(num<0) {
				System.out.println("�ٽ��Է�!");
				continue;
			}
			cnt--;
			if(num%2==1) {
				res++;
			}
		}
		System.out.println("Ȧ���� "+res+"���Դϴ�.");
		
		
		/*
		int cnt=0;
		for(int i=0;i<5;i++) {
			int num;
			while(true) {
				System.out.print("�����Է�: ");
				num=sc.nextInt();
				if(num<0) {
					System.out.println("�ٽ��Է�!");
					continue;
				}				
				break;
//				if(num>=0) {
//					break;
//				}
//				System.out.println("�ٽ��Է�!");
			}
			if(num%2==1) {
				cnt++;
			}
		}
		System.out.println("Ȧ���� "+cnt+"���Դϴ�.");
*/


	}

}











