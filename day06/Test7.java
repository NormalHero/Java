
public class Test7 {

	static void func(int a) {
		for(int i=1;i<=a;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void func(int a,int b) {
		if(a>b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
		for(int i=a;i<=b;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
	}


	public static void main(String[] args) {

		func(10);
		func(10,5);
		func(6,8);

	}
	/*
	main(){
	func(4);
	-> 1 2 3 4 출력하는 함수
	func(6,8);
	-> 6 7 8 출력하는 함수
	func(7,3);
	-> 3 4 5 6 7 출력하는 함수
	}
	 */
}
