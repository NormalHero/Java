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
			System.out.println("과속!!!");
		}
	}
	void speedDown(int speed) {
		this.speed-=speed;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("정지...");
		}
	}
	void show() {
		System.out.println(this.name+"님의 자동차: "+this.speed+"/"+this.maxSpeed);
	}
}

public class Test1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		System.out.print("요소의 개수입력: ");
		int N=sc.nextInt();
		sc.nextLine();

		Car[] car=new Car[N];

		for(int i=0;i<N;i++) {
			System.out.print("이름입력: ");
			String name=sc.nextLine();
			System.out.print("최고속도지정: ");
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
			System.out.println("1.업 2.다운 3.출력 4.종료");
			System.out.print("입력: ");
			int act=sc.nextInt();
			if(act==1) {
				int num,speed;
				do {
					System.out.print("번호입력: ");
					num=sc.nextInt();
				}while(num<1||N<num);
				do {
					System.out.print("속도입력: ");
					speed=sc.nextInt();
				}while(speed<=0);
				car[num-1].speedUp(speed);
			}
			else if(act==2) {
				int num,speed;
				do {
					System.out.print("번호입력: ");
					num=sc.nextInt();
				}while(num<1||N<num);
				do {
					System.out.print("속도입력: ");
					speed=sc.nextInt();
				}while(speed<=0);
				car[num-1].speedDown(speed);
			}
			else if(act==3) {
				System.out.println("==목록출력==");
				for(Car v:car) {
					v.show();
				}
				System.out.println();
			}
			else if(act==4) {
				break;
			}
			else {
				System.out.println("잘못된 입력! 확인후 입력해주세요!~~");
			}
		}
		
	}

}
