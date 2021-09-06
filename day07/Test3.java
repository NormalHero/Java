
class Car{
	String name;
	int speed;
	int maxSpeed;
	Car(){
		this("����",120);
	}
	Car(String name){
		this(name,120);
	}
	Car(String name,int maxSpeed){
		this.name=name; // �ʱ�ȭ �۾��� �����ڳ��ο��� ����
		this.speed=0; // this == �ڱ��ڽŰ�ü
		this.maxSpeed=maxSpeed;
	}
	void show() {
		System.out.println(this.name+"���� �ڵ��� ����ӵ�: "+this.speed+" �ְ�ӵ�: "+this.maxSpeed);
	}
	void speedUp() {
		this.speed+=20;
		if(this.speed>=this.maxSpeed) {
			this.speed=this.maxSpeed;
			System.out.println("��������!!!");
		}
	}
	void speedUp(int speed) {
		if(speed<=0) {
			System.out.println("��ȿ�������� ���Դϴ�!");
			return;
		}
		this.speed+=speed;
		if(this.speed>=maxSpeed) {
			this.speed=maxSpeed;
			System.out.println("��������!!!");
		}
	}
	void speedDown() {
		this.speed-=20;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("����.....");
		}
	}
	void speedDown(int speed) {
		if(speed<=0) {
			System.out.println("��ȿ�������� ���Դϴ�!");
			return;
		}
		this.speed-=speed;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("����.....");
		}
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Car c1=new Car();
//		c1.name="����";
//		c1.maxSpeed=120;
//		c1.speed=0;
		Car c2=new Car("ȫ�浿");
		Car c3=new Car("�ƹ���",200);
		
		c1.show();
		c2.show();
		c3.show();
		
		c2.speedUp();
		c2.show();
		c2.speedUp(110);
		c2.show();
		
		c2.speedDown();
		c2.show();
		c2.speedDown(101);
		c2.show();
		
		
		
	}

}
