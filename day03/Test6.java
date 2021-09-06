import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// [반복문]

		// while  vs  for


		// while: 반복횟수가 불명확할때, 무한하게, 특정조건을 만족할때까지 계속

		// for: 반복횟수가 분명할때, N번, x회, 범위가 주어졌을때(1~10까지)

		/*
		while(조건식) { 조건식이 F이면, 16번라인에서 "바로" 19번라인으로 이동
			조건식이 T여야 {}블록구간을 수행
		}
		 */

		/*
		int i=1;
		while(i<=3) {
			System.out.println("안녕하세요!");
			i++;
		}
		System.out.println("i= "+i);
		 */

		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		int sum=0;

		int i=1;
		while(i<=num) {
			if(i%2==1) {
				System.out.print(i+" ");
				sum+=i;
			}
			i++;
		}
		System.out.println();
		System.out.println("총합은 "+sum+"입니다.");




	}

}
