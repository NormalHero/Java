// [����������,����������,������]

class CreditCard{
	private String name; // private: ���� Ŭ�����̿��� ������ ��� ����
	private int money;
	// getter,setter: private�����Ǿ��ִ� ��������鿡�� �����Ҽ��ֵ����ϴ� �޼���
	String getName() {
		return this.name;
	}
	void setName(String name) {
		this.name=name;
	}
	CreditCard(String name,int money){
		this.name=name;
		this.money=money;
		System.out.println("ī���ϿϷ�!");
	}
	void show() {
		System.out.println(this.name+"���� �ܾ�: "+this.money+"��");
	}
}

public class Test5 {

	public static void main(String[] args) {
		
		
		CreditCard c=new CreditCard("ȫ�浿",10000);
		c.show();
		
		//c.name="�ƹ���";
		//c.money*=100;
		
		c.setName("�ƹ���");
		System.out.println(c.getName());
		
	}

}
