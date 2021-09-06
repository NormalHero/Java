import java.util.Scanner;

abstract class Phone{
	String name;
	int passwd;
	Phone(String name){
		this(name,1111);
	}
	Phone(String name,int passwd){
		this.name=name;
		this.passwd=passwd;
	}
	abstract void call();
	boolean passwdCheck() {
		Scanner sc=new Scanner(System.in);
		System.out.print("��й�ȣ�Է�: ");
		int pw=sc.nextInt();
		if(this.passwd==pw) {
			return true;
		}
		System.out.println("��й�ȣ ����ġ!");
		return false;
	}
}
class IPhone extends Phone{
	IPhone(String name) {
		super(name);
	}
	IPhone(String name, int passwd) {
		super(name, passwd);
	}
	void call() {
		if(this.passwdCheck()) {
			System.out.println(this.name+"��, �ݰ����ϴ�! �ø��Դϴ�~~!");
		}
	}
}
class GPhone extends Phone{
	GPhone(String name) {
		super(name);
	}
	GPhone(String name, int passwd) {
		super(name, passwd);
	}
	void call() {
		if(this.passwdCheck()) {
			System.out.println(this.name+"��, �ݰ����ϴ�! �������Դϴ�~~!");
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		IPhone ip=new IPhone("ȫ�浿");
		ip.call();
		
		GPhone gp=new GPhone("�ƹ���",1234);
		gp.call();
		
		
		
		
		
		
		
		
	}

}
