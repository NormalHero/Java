import java.util.Scanner;

class Car{
	String name;
	int speed;
	int maxSpeed;
	Car(String name){
		this(name,120);
	}
	Car(String name,int maxSpeed){
		this.name=name;
		this.maxSpeed=maxSpeed;
		this.speed=0;
	}
	void speedUp(int speed) {
		this.speed+=speed;
		if(this.speed>this.maxSpeed) {
			this.speed=this.maxSpeed;
			System.out.println("����!!!");
		}
	}
	void speedDown(int speed) {
		this.speed-=speed;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("����...");
		}
	}
	void show() {
		System.out.println(this.name+"���� �ڵ���: "+this.speed+"/"+this.maxSpeed);
	}
}

public class Test1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("����� �����Է�: ");
		int N=sc.nextInt();
		sc.nextLine();

		Car[] car=new Car[N];

		for(int i=0;i<N;i++) {
			System.out.print("�̸��Է�: ");
			String name=sc.nextLine();
			System.out.print("�ְ�ӵ�����: ");
			int maxSpeed=sc.nextInt();
			sc.nextLine();
			if(maxSpeed>120) {
				car[i]=new Car(name,maxSpeed);
			}
			else {
				car[i]=new Car(name);
			}
		}

		System.out.println();
		while(true) {
			System.out.println("1.�� 2.�ٿ� 3.��� 4.����");
			System.out.print("�Է�: ");
			int act=sc.nextInt();
			if(act==1) {
				int num,speed;
				do {
					System.out.print("��ȣ�Է�: ");
					num=sc.nextInt();
				}while(num<1||N<num);
				do {
					System.out.print("�ӵ��Է�: ");
					speed=sc.nextInt();
				}while(speed<=0);
				car[num-1].speedUp(speed);
			}
			else if(act==2) {
				int num,speed;
				do {
					System.out.print("��ȣ�Է�: ");
					num=sc.nextInt();
				}while(num<1||N<num);
				do {
					System.out.print("�ӵ��Է�: ");
					speed=sc.nextInt();
				}while(speed<=0);
				car[num-1].speedDown(speed);
			}
			else if(act==3) {
				System.out.println("==������==");
				for(Car v:car) {
					v.show();
				}
				System.out.println();
			}
			else if(act==4) {
				break;
			}
			else {
				System.out.println("�߸��� �Է�! Ȯ���� �Է����ּ���!~~");
			}
		}
		
	}

}
