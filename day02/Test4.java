
public class Test4 {

	public static void main(String[] args) {
		
		// 증감 연산자  ++ --
		/*
		int a=0;
		++a; // 전위증감연산자.우선순위 높음
		a++; // 후위증감연산자.우선순위 매우 낮음
		System.out.println("a= "+a);
		
		int b=a++;
		System.out.println("a= "+a+" , b= "+b);
		b=++a;
		System.out.println("a= "+a+" , b= "+b);
		*/
		// ★디버깅표★
		
		
		
		int a,b,c,d;
		a=1;
		b=++a;
		c=a++;
		d=b++ + ++c;
		// ++c -> 3
		// b+c -> 5
		// d=5
		// b++ -> 3
		//System.out.println(a+" "+b+" "+c+" "+d);
		
		
		
		
		// 비교 연산자  > < >= <= == !=(! NOT)
		// 질문 -> true/false 대답을 얻을수있음
		System.out.println("a>d = "+(a>d));
		System.out.println("a<d = "+(a<d));
		System.out.println("a>=b = "+(a>=b));
		System.out.println("a<=b = "+(a<=b));
		System.out.println("a==d = "+(a==d));
		System.out.println("a!=d = "+(a!=d));
		
		System.out.println();
		
		// 논리 연산자
		// and: 그리고, ~~이면서, ~~이고   &&
		// or: 혹은, 또는, ~~이거나   ||
		// not: 부정   !
		System.out.println("10<5 and 10>6 = "+((10<5)&&(10>6)));
		System.out.println("10<5 or 10>6 = "+((10<5)||(10>6)));
		System.out.println("not 10>5 = "+!(10>5));
		
		System.out.println();
		
		
		int x=10,y=20,z=30;
		System.out.println(x<y && x>z);
		System.out.println(x>y || x>z);
		System.out.println(!(x>y));
		
		
		
		
		
		
		
		
		
	}

}
