import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		// 무한반복문==무한루프  ->  종료버튼으로 콘솔종료!!!
		
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
		System.out.println("3의 배수의 개수는 "+cnt+"개입니다.");
		
		
	}

}
