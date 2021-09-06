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
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			if(num<0) {
				System.out.println("다시입력!");
				continue;
			}
			cnt--;
			if(num%2==1) {
				res++;
			}
		}
		System.out.println("홀수는 "+res+"개입니다.");
		
		
		/*
		int cnt=0;
		for(int i=0;i<5;i++) {
			int num;
			while(true) {
				System.out.print("정수입력: ");
				num=sc.nextInt();
				if(num<0) {
					System.out.println("다시입력!");
					continue;
				}				
				break;
//				if(num>=0) {
//					break;
//				}
//				System.out.println("다시입력!");
			}
			if(num%2==1) {
				cnt++;
			}
		}
		System.out.println("홀수는 "+cnt+"개입니다.");
*/


	}

}











