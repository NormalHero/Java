// [접근제어자,접근지정자,접근자]

class CreditCard{
	private String name; // private: 본인 클래스이외의 접근을 모두 막음
	private int money;
	// getter,setter: private설정되어있는 멤버변수들에게 접근할수있도록하는 메서드
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name=name;
	}
	CreditCard(String name,int money){
		this.name=name;
		this.money=money;
		System.out.println("카드등록완료!");
	}
	void show() {
		System.out.println(this.name+"님의 잔액: "+this.money+"원");
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		
		CreditCard c=new CreditCard("홍길동",10000);
		c.show();
		
		//c.name="아무무";
		//c.money*=100;
		
		c.setName("아무무");
		System.out.println(c.getName());
		
	}

}
