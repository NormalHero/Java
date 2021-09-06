
public class Test7 {
	public static void main(String[] args) {

		// [중첩반복문,이중for문]
		/*
		for(int a=2;a<=9;a++) {
			// 8회
			for(int i=1;i<=9;i++) {
				System.out.println(a+" x "+i+" = "+a*i);
				// 9회x8회=72회
			}
			System.out.println("--------------------");
			// 8회
		}


		for(int a=0;a<5;a++) {
			for(int i=0;i<5;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		 */


		for(int a=0;a<5;a++) {
			for(int i=0;i<=a;i++) {
				System.out.print("*");
			}
			System.out.println();
		}



	}




















}
