import java.util.Scanner;

interface useCard{
	boolean checkPasswd();
	void pay(int money);
	int min=0;
	int limit=10000;
}
class Card implements useCard{
	String name;
	private int passwd;
	int bal;
	public int getPasswd() {
		return passwd;
	}
	public void setPasswd(int passwd) {
		this.passwd = passwd;
	}
	Card(String name,int passwd,int bal){
		this.name=name;
		this.passwd=passwd;
		this.bal=bal;
	}
	@Override
	public boolean checkPasswd() {
		Scanner sc=new Scanner(System.in);
		System.out.print(this.name+"님, 비밀번호입력: ");
		int passwd=sc.nextInt();
		if(passwd==this.passwd) {
			return true;
		}
		System.out.println("비밀번호 불일치!");
		return false;
	}
	@Override
	public void pay(int money) {
		if(money>this.bal) {
			System.out.println("잔액부족!");
			return;
		}
		if(money>=limit) {
			if(!this.checkPasswd()) {
				return;
			}
		}
		this.bal-=money;
		System.out.println("결제완료!");
	}
	public String toString() { // 부모의 공개범위 <= 자식의 공개범위
		return this.name+"님의 현재 잔액은"+this.bal+"원입니다.";
	}
}
class PointCard extends Card{
	PointCard(String name, int passwd, int bal) {
		super(name, passwd, bal);
		this.rate=0.5;
		this.point=0;
	}
	double rate;
	int point;
	@Override
	public void pay(int money) {
		if(this.point>=1000) {
			System.out.println("포인트로결제함!");
			this.point=0;
			return;
		}
		if(money>this.bal) {
			System.out.println("잔액부족!");
			return;
		}
		if(money>=limit) {
			if(!this.checkPasswd()) {
				return;
			}
		}
		this.bal-=money;
		this.point+=(money*this.rate);
		System.out.println("결제완료!");
	}
	@Override
	public String toString() {
		return this.name+"님 현재 잔액은 "+this.bal+"원이고, 포인트는 "+this.point+"점입니다.";
	}
	
}
class A{
	
}
public class Test1 {

	public static void main(String[] args) {
		
		Card[] user=new Card[2];
		user[0]=new Card("홍길동",1234,20000);
		user[1]=new PointCard("아무무",5678,20000);
		
		for(Card v:user) {
			System.out.println(v);
		}
		// 최상위 클래스 Object
		// equals(), toString()
		// toString(): print(),println()에서 객체를 출력하고자할때 자동호출되는 메서드
		
	}

}









