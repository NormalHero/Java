import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// [무한루프,무한반복문]
		// 1. 특정조건을 만족할때까지 계속
		//    -> while문내의 수행중에 발생할수도있는 조건!
		// 2. 영원히
		// "종료조건"을 코드내에 반드시 구현해야함!!!		
		/*
		int i=0;
		while(true) {
			System.out.println(i);
			i++;
			if(i==1000) { // 종료조건
				break;
			}
		}
		System.out.println("끝");
		*/
		Scanner sc=new Scanner(System.in);
		/*
		int sum=0;
		while(true) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			
			if(num==0) { // 종료조건
				break;
			}
			sum+=num;
		}
		System.out.println("총합은 "+sum+"입니다.");
		
		int sum=0;
		while(true) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			
			if(num==0) {
				break;
			}
			else if(num<0) {
				num*=(-1);
			}
			sum+=num;
		}
		*/
		while(true) {
			System.out.print("정수입력: ");
			int num=sc.nextInt();
			
			if(num<0) {
				break;
				// 반복문을 "즉시" 종료시키는 키워드
				// "종료조건"을 구현할때에 주로 이용
			}
			
			if(num%2==0) {
				continue;
				// 반복문의 수행을 "즉시" 중단하고,
				// 해당 반복문의 처음(while문의 조건식)으로 이동하는 키워드
			}			
			System.out.println(num);
		} // 홀수이면, 출력해주세요!
		// => 짝수라면, 출력하지마세요!
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
