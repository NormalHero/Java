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
		System.out.println(this.name+"���� �ܾ��� "+this.money+"���Դϴ�.");
	}
	void pay() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����ұݾ��Է�: ");
		int money=sc.nextInt();
		if(money>this.money) {
			System.out.println("�ܾ׺���!");
			return;
		}
		this.money-=money;
		System.out.println("�����Ϸ�!");
	}
	void pay(int money) {
		if(money>this.money) {
			System.out.println("�ܾ׺���!");
			return;
		}
		this.money-=money;
		System.out.println("�����Ϸ�!");
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
				System.out.print("�����Է�: ");
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
			System.out.println("�ܾ׺���!");
			return;
		}
		this.money-=this.fare;
		System.out.println("�����մϴ�.");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		
		BusCard b1=new BusCard("ȫ�浿",1000);
		BusCard b2=new BusCard("�Ӳ���",1000,21);
		
	
		
		b1.pay();
		b2.pay();

		
		
		b1.show();
		b2.show();
	}

}
