import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// for문
		/*
		int i;
		for(i=1;i<=3;i++) {
			System.out.println("안녕하세요!");
		}
		System.out.println("최종 i= "+i);

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
				continue; // for문에서는 "즉시" 증감식으로 이동
			}
			System.out.print(i+" ");			
		}
		System.out.println();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;	
		}
		System.out.println("1부터 "+num+"까지의 총합은 "+sum+"입니다.");
		System.out.println();
		System.out.println();
		sum=0;
		for(int i=0;i<10;i++) {
			System.out.print((i+1)+"번째 정수입력: ");
			int n=sc.nextInt();
			sum+=n;
		}
		double avg=sum/10.0;
		System.out.println("총합은 "+sum+"이고, 평균은 "+avg+"입니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
