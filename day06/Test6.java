
public class Test6 {

	static int add(int x,int y) {
		// 같은 기능의 함수들의 이름을 동일하게 작성해보자!
		// [오버로딩]
		// 1.인자의 개수,자료형(data type)이 달라야함
		// 2.return이 달라야함
		return x+y;
	}
	static int add(int x,int y,int z) {
		return x+y+z;
	}
	static double add(double x,double y) {
		return x+y;
	}
	
	public static void main(String[] args) {
		
		int a=10,b=20;
		int sum=add(a,b);
		System.out.println("sum은 "+sum+"입니다.");
		
		int c=30;
		sum=add(a,b,c);
		System.out.println("sum은 "+sum+"입니다.");
		
		double d=1.1,dd=1.2;
		double sum2=add(d,dd);
		System.out.println("sum2은 "+sum2+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		int num1=100,num2=200;
		int res=add(num1,num2);
		System.out.println("res는 "+res+"입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
