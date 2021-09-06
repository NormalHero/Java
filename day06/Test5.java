import java.util.Scanner;

public class Test5 {

	static int func3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		
		return num; // 해당 함수를 호출한 위치로 값을 "즉시" 전달하는 역할
	}
	
	static double function(){
		Scanner sc=new Scanner(System.in);
		System.out.print("실수1 입력: ");
		double d1=sc.nextDouble();
		System.out.print("실수2 입력: ");
		double d2=sc.nextDouble();
		double res=d1>d2? d1-d2:d2-d1;
		return res;
	}
	
	public static void main(String[] args) {
		
		
		//int a=func3();
		//int b=func3();
		
		//System.out.println("a= "+a);
		//System.out.println("b= "+b);
	
		
		double r=function();
		System.out.println("function()호출결과는 "+r+"입니다.");
		
	}

}
