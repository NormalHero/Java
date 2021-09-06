import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		// [제어문]
		// 조건문   vs   반복문

		// 조건문
		// ~~할때,만약 ~~라면,분기점,양자택일

		// 반복문
		// 여러번 진행,N회,x번,무한하게,특정조건을 만족할때까지 계속


		// [조건문]
		// if  vs  switch

		/*
		if(조건식) {
			해당조건식이 T라면,
			{}안의 코드들 수행가능
		}
		 */

		Scanner sc=new Scanner(System.in);
		/*
		System.out.print("정수입력: ");
		int num=sc.nextInt();

		if(num%2==0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
		 */

		int n1,n2;
		System.out.print("정수1 입력: ");
		n1=sc.nextInt();
		System.out.print("정수2 입력: ");
		n2=sc.nextInt();

		
		if(n1==n2) {
			System.out.println("두정수의 크기가 같습니다.");
		}
		else if(n1>n2) { // 분기점 추가
			System.out.println(n1+" 확인1");
		}
		else {
			System.out.println(n2+" 확인2");
		}














	}

}
