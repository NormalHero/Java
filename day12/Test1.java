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
		System.out.print(this.name+"��, ��й�ȣ�Է�: ");
		int passwd=sc.nextInt();
		if(passwd==this.passwd) {
			return true;
		}
		System.out.println("��й�ȣ ����ġ!");
		return false;
	}
	@Override
	public void pay(int money) {
		if(money>this.bal) {
			System.out.println("�ܾ׺���!");
			return;
		}
		if(money>=limit) {
			if(!this.checkPasswd()) {
				return;
			}
		}
		this.bal-=money;
		System.out.println("�����Ϸ�!");
	}
	public String toString() { // �θ��� �������� <= �ڽ��� ��������
		return this.name+"���� ���� �ܾ���"+this.bal+"���Դϴ�.";
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
			System.out.println("����Ʈ�ΰ�����!");
			this.point=0;
			return;
		}
		if(money>this.bal) {
			System.out.println("�ܾ׺���!");
			return;
		}
		if(money>=limit) {
			if(!this.checkPasswd()) {
				return;
			}
		}
		this.bal-=money;
		this.point+=(money*this.rate);
		System.out.println("�����Ϸ�!");
	}
	@Override
	public String toString() {
		return this.name+"�� ���� �ܾ��� "+this.bal+"���̰�, ����Ʈ�� "+this.point+"���Դϴ�.";
	}
	
}
class A{
	
}
public class Test1 {

	public static void main(String[] args) {
		
		Card[] user=new Card[2];
		user[0]=new Card("ȫ�浿",1234,20000);
		user[1]=new PointCard("�ƹ���",5678,20000);
		
		for(Card v:user) {
			System.out.println(v);
		}
		// �ֻ��� Ŭ���� Object
		// equals(), toString()
		// toString(): print(),println()���� ��ü�� ����ϰ����Ҷ� �ڵ�ȣ��Ǵ� �޼���
		
	}

}









