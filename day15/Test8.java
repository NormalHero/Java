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
public class Test8 {

	static void func1() throws Exception {
		int a=10,b=1;
		System.out.println(a/b);
		System.out.println("func1() �Ϸ�!");
	}
	static void func2() throws Exception {
		Exception myE=new Exception("�������翹�ܰ�ü");
		throw myE;
	}
	static void func3() throws MyException {
		MyException myE=new MyException("���ܸ޼���~~");
		throw myE;
	}


	public static void main(String[] args) {

		// [����ó�� �̷��]
		//  : � �Լ����� ���ܰ� �߻��ص�, �ش� �Լ��� ȣ���� ��ġ���� ���ܸ� ó���ϰ���� ���
		//  : �ش��Լ��� �̿��ϴ� ��������, ����ó���� �ݵ�� �����Ҽ��ְ� ������ ����� -> [������]
		
		

		try {
			func1();
			//func2();
			func3();
		}
		catch(MyException e) {
			System.out.println("�������� ����ó������");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}



	}

}
