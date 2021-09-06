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
		System.out.println(this.name+"님의 잔액은 "+this.money+"원입니다.("+this.passwd+")");
	}
	boolean checkPasswd() {
		Scanner sc=new Scanner(System.in);
		int passwd;
		int cnt=3;
		System.out.print(this.name+"님, ");
		do {
			System.out.print("비밀번호입력: ");
			passwd=sc.nextInt();
			cnt--;
		}while(cnt!=0 && passwd!=this.passwd);
		if(passwd!=this.passwd) {
			System.out.println("비밀번호가 일치하지않습니다!");
			return true;
		}
		return false;
	}
	void pay(int money) {
		if(this.money<money) {
			System.out.println("잔액부족!");
			return;
		}
		if(this.checkPasswd()) {
			return;
		}
		this.money-=money;
		System.out.println(this.name+"님, 결제완료!");
	}
	void inMoney(int money) {
		this.money+=money;
		System.out.println(this.name+"님, 입금완료!");
	}
	void outMoney(int money) {
		if(this.money<money) {
			System.out.println("잔액부족!");
			return;
		}
		if(this.checkPasswd()) {
			return;
		}
		this.money-=money;
		System.out.println(this.name+"님, 출금완료!");
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
		System.out.println(this.name+"님, 카드등록완료!");
	}
}
public class Test1 {

	public static void main(String[] args) {

		Card c1=new Card("홍길동");
		//Card c2=new Card("임꺽정",10000);
		//Card c3=new Card("아무무",10000,1234);

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
