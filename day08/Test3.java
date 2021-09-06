
class Shape{
	void draw() {
		System.out.println("도형 그리기");
	}
}
class Circle extends Shape{
	void draw() { // 오버라이딩(재정의): 부모의 메서드를 이용할생각이지만, 기능이 자식클래스와 맞지않는경우에 재정의
		System.out.println("원 그리기");
	}
}

// 오버로딩 vs 오버라이딩
// 1) input,output의 갯수,타입이 다른경우
// 2) 상속관계에서 발생

public class Test3 {

	public static void main(String[] args) {
		
		
		Shape s=new Shape();
		s.draw();
		
		
		Circle c=new Circle();
		c.draw();
		
		
	}

}
