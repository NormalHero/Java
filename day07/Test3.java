
class Car{
	String name;
	int speed;
	int maxSpeed;
	Car(){
		this("무명",120);
	}
	Car(String name){
		this(name,120);
	}
	Car(String name,int maxSpeed){
		this.name=name; // 초기화 작업을 생성자내부에서 진행
		this.speed=0; // this == 자기자신객체
		this.maxSpeed=maxSpeed;
	}
	void show() {
		System.out.println(this.name+"님의 자동차 현재속도: "+this.speed+" 최고속도: "+this.maxSpeed);
	}
	void speedUp() {
		this.speed+=20;
		if(this.speed>=this.maxSpeed) {
			this.speed=this.maxSpeed;
			System.out.println("과속주의!!!");
		}
	}
	void speedUp(int speed) {
		if(speed<=0) {
			System.out.println("유효하지않은 값입니다!");
			return;
		}
		this.speed+=speed;
		if(this.speed>=maxSpeed) {
			this.speed=maxSpeed;
			System.out.println("과속주의!!!");
		}
	}
	void speedDown() {
		this.speed-=20;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("정지.....");
		}
	}
	void speedDown(int speed) {
		if(speed<=0) {
			System.out.println("유효하지않은 값입니다!");
			return;
		}
		this.speed-=speed;
		if(this.speed<=0) {
			this.speed=0;
			System.out.println("정지.....");
		}
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		Car c1=new Car();
//		c1.name="무명";
//		c1.maxSpeed=120;
//		c1.speed=0;
		Car c2=new Car("홍길동");
		Car c3=new Car("아무무",200);
		
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
