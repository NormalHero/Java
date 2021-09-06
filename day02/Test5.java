import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		// 조건 연산자 == 삼항 연산자
		// 조건식 ? T:F
		/*
		int num=10<5 ? 100:200;
		System.out.println("num= "+num);
		*/
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.print("정수1입력: ");
		int num1=sc.nextInt();
		System.out.print("정수2입력: ");
		int num2=sc.nextInt();
		
		int res=num1>num2? num1:num2;		
		System.out.println(num1+"과 "+num2+"중, 더 큰 정수는 "+res);
		*/
		
		int num;
		System.out.print("정수입력: ");
		num=sc.nextInt();
		String str=  num%2==1 ? "홀":"짝";
		System.out.println(str+"수입니다.");
		
		
		
		
		
		
		
		double n1,n2,n3;
		System.out.print("실수1입력: ");
		n1=sc.nextDouble();
		System.out.print("실수2입력: ");
		n2=sc.nextDouble();
		System.out.print("실수3입력: ");
		n3=sc.nextDouble();

		double min=n1<n2 ? n1:n2;
		min=min<n3 ? min:n3;
		System.out.println("가장 작은 실수는 "+min+"입니다.");
		
		
		
		
		
		
		
		
		
		
		


	}

}
