
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


public class Test7 {

	public static void main(String[] args) {
		
		
		MyException e1=new MyException();
		MyException e2=new MyException("예외메세지");
		
		
		try {
			
			//throw e1;
			
			throw e2;
			
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
