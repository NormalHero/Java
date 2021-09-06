import java.util.Scanner;

class CheckCard{
	int money;
	String name;
	CheckCard(String name){
		this(name,0);
	}
	CheckCard(String name,int money){
		this.name=name;
		this.money=money;
	}
	void show() {
		System.out.println(this.name+"님의 잔액은 "+this.money+"원입니다.");
	}
	void pay() {
		Scanner sc=new Scanner(System.in);
		System.out.print("결제할금액입력: ");
		int money=sc.nextInt();
		if(money>this.money) {
			System.out.println("잔액부족!");
			return;
		}
		this.money-=money;
		System.out.println("결제완료!");
	}
	void pay(int money) {
		if(money>this.money) {
			System.out.println("잔액부족!");
			return;
		}
		this.money-=money;
		System.out.println("결제완료!");
	}
}

class BusCard extends CheckCard{
	int age;
	int fare;
	BusCard(String name,int money){
		this(name,money,-1);
	}
	BusCard(String name,int money,int age){
		super(name,money);
		if(age==-1) {
			Scanner sc=new Scanner(System.in);
			do {
				System.out.print("나이입력: ");
				age=sc.nextInt();
			}while(age<=0 || 200<=age);
		}
		this.age=age;
		if(this.age<9||64<this.age) {
			this.fare=0;
		}
		else if(this.age<20) {
			this.fare=800;
		}
		else {
			this.fare=1300;
		}
	}
	void pay() {
		if(this.money<this.fare) {
			System.out.println("잔액부족!");
			return;
		}
		this.money-=this.fare;
		System.out.println("승차합니다.");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		
		BusCard b1=new BusCard("홍길동",1000);
		BusCard b2=new BusCard("임꺽정",1000,21);
		
	
		
		b1.pay();
		b2.pay();

		
		
		b1.show();
		b2.show();
	}

}
