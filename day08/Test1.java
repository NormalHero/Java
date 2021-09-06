import java.util.Scanner;

class Card{
	String name;
	int money;
	private int passwd;
	int getPasswd() {
		return this.passwd;
	}
	void setPasswd(int passwd) {
		this.passwd=passwd;
	}
	void show() {
		System.out.println(this.name+"���� �ܾ��� "+this.money+"���Դϴ�.("+this.passwd+")");
	}
	boolean checkPasswd() {
		Scanner sc=new Scanner(System.in);
		int passwd;
		int cnt=3;
		System.out.print(this.name+"��, ");
		do {
			System.out.print("��й�ȣ�Է�: ");
			passwd=sc.nextInt();
			cnt--;
		}while(cnt!=0 && passwd!=this.passwd);
		if(passwd!=this.passwd) {
			System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�!");
			return true;
		}
		return false;
	}
	void pay(int money) {
		if(this.money<money) {
			System.out.println("�ܾ׺���!");
			return;
		}
		if(this.checkPasswd()) {
			return;
		}
		this.money-=money;
		System.out.println(this.name+"��, �����Ϸ�!");
	}
	void inMoney(int money) {
		this.money+=money;
		System.out.println(this.name+"��, �ԱݿϷ�!");
	}
	void outMoney(int money) {
		if(this.money<money) {
			System.out.println("�ܾ׺���!");
			return;
		}
		if(this.checkPasswd()) {
			return;
		}
		this.money-=money;
		System.out.println(this.name+"��, ��ݿϷ�!");
	}
	Card(String name){
		this(name,0,1111);
	}
	Card(String name,int money){
		this(name,money,1111);
	}
	Card(String name,int money,int passwd){
		this.name=name;
		this.money=money;
		this.passwd=passwd;
		System.out.println(this.name+"��, ī���ϿϷ�!");
	}
}
public class Test1 {

	public static void main(String[] args) {

		Card c1=new Card("ȫ�浿");
		//Card c2=new Card("�Ӳ���",10000);
		//Card c3=new Card("�ƹ���",10000,1234);

		c1.show();

		///c1.passwd=1234;
		c1.inMoney(5000);
		//c1.outMoney(10000);
		c1.outMoney(4000);
		c1.outMoney(4000);

		c1.show();



		//c2.show();
		//c3.show();

	}

}
