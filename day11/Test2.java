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
		System.out.print("비밀번호입력: ");
		int pw=sc.nextInt();
		if(this.passwd==pw) {
			return true;
		}
		System.out.println("비밀번호 불일치!");
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
			System.out.println(this.name+"님, 반갑습니다! 시리입니다~~!");
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
			System.out.println(this.name+"님, 반갑습니다! 갤럭시입니다~~!");
		}
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		IPhone ip=new IPhone("홍길동");
		ip.call();
		
		GPhone gp=new GPhone("아무무",1234);
		gp.call();
		
		
		
		
		
		
		
		
	}

}
