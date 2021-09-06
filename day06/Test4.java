import java.util.Scanner;

public class Test4 {
	
	static void func1(){
		System.out.println("안녕하세요!~~");
	} // 함수를 정의했다.
	
	static void func2(int i) {
		i+=2;
		System.out.println("func2()함수 호출됨!");
		System.out.println("받은 인자의 값은 "+i+"입니다.");
		System.out.println();
	}
	
	static void swap(int a,int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		swap(a,b);
		System.out.println("a="+a+", b="+b);
		
		
		
		
		//func1();
		//func1();
		//func1(); // 함수를 호출했다.
		/*
		int a=10;
		System.out.println("func2()호출전: a="+a);
		func2(a); // 값(value)을 인자에 보낸다!!!!!
		System.out.println("func2()호출후: a="+a);
		//func2(0);
		//func2(-10);
		*/
		
		// [함수]
		// => 코드의 재사용성 증가☆
		// 사용자가 정의하는 함수
		
		// 1.input: 입력값,인자,인수,매개변수
		// 2.output: 결과값,리턴값,return,반환값,출력값
		// 3.기능
		
		// output 함수명(input)
		/*
		for(String v:args) {
			System.out.println(v);
		}
		*/
		
		// input x  output x
		// input o  output x
		// input x  output o
		// input o  output o
		
	}

}
