
class MyException extends Exception{

	public MyException() {
		super("�������翹��Ŭ����");
		// TODO Auto-generated constructor stub
	}

	public MyException(String message) {
		super("�������翹��Ŭ����: "+message);
		// TODO Auto-generated constructor stub
	}
	
}


public class Test7 {

	public static void main(String[] args) {
		
		
		MyException e1=new MyException();
		MyException e2=new MyException("���ܸ޼���");
		
		
		try {
			
			//throw e1;
			
			throw e2;
			
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		

	}

}
