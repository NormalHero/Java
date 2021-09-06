/*
[ 객체지향코딩 ]
기본단위: 클래스 --인스턴스화.객체화(new 클래스명())--> 객체.인스턴스
  (대문자로 시작하는것이 일반적)
  
  생성자: 인스턴스화(객체화)를 담당하는 함수.클래스에서 객체를 생성할때 사용하는 함수.클래스와 이름이 동일
  		리턴타입 명시xxx
  인자가없는 생성자 -> 디폴트생성자.기본생성자 => 작성하지않아도 기본적으로 제공해줌!
  				만약, 다른 생성자를 1개이상 정의하면 더이상 기본제공되지않는다!!

붕어빵틀:붕어빵 = 클래스:객체 = 1:N
  코드의 재사용성 증가

1) 추상화
2) 캡슐화: 코드 재사용성 증가 / 오류의 파급효과 절감 / 정보은닉
3) 상속: 중복코드 최소화 / 개발비용절감
4) 다형성: 함수(메서드)에게 주어(주체)가 생기게되어 나타나는 효과
*/
class Circle{
	String name; // 멤버
	int radius; // 멤버변수,속성,필드
	double area;
	final double PI=3.14;
	void show() { // Circle클래스의 객체들만 이용할수있는 멤버함수(메서드,메소드)
		System.out.println(this.name+"의 반지름은 "+this.radius+"입니다.");
	}
	Circle(){
		System.out.println("기본생성자 호출됨!");
	}
	Circle(String name,int radius){ // 생성자 오버로딩
		this.name=name;
		this.radius=radius;
		System.out.println("생성자 호출됨!");
	}
	void getArea() {
		this.area=this.radius*this.radius*this.PI;
		System.out.println(this.name+"의 넓이는 "+this.area+"입니다.");
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		Circle c1=new Circle(); // new 클래스명()->생성자
		c1.name="피자"; // .  멤버접근연산자
		c1.radius=10;
		
		Circle c2=new Circle("도넛",1);
		//c2.name="도넛";
		//c2.radius=1;
		
		
		c1.show();
		c2.show();
		
		c1.getArea();
		c2.getArea();
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
