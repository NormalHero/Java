class MyException extends Exception{

	public MyException() {
		super("내가만든예외클래스");
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super("내가만든예외클래스: "+message);
		// TODO Auto-generated constructor stub
	}
	
}
public class Test8 {

	static void func1() throws Exception {
		int a=10,b=1;
		System.out.println(a/b);
		System.out.println("func1() 완료!");
	}
	static void func2() throws Exception {
		Exception myE=new Exception("내가만든예외객체");
		throw myE;
	}
	static void func3() throws MyException {
		MyException myE=new MyException("예외메세지~~");
		throw myE;
	}


	public static void main(String[] args) {

		// [예외처리 미루기]
		//  : 어떤 함수에서 예외가 발생해도, 해당 함수를 호출한 위치에서 예외를 처리하고싶은 경우
		//  : 해당함수를 이용하는 공간에서, 예외처리를 반드시 구현할수있게 에러를 띄워줌 -> [강제성]
		
		

		try {
			func1();
			//func2();
			func3();
		}
		catch(MyException e) {
			System.out.println("디테일한 예외처리가능");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}



	}

}
