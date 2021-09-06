
class Circle{
	String name; // 멤버변수,속성,필드 => 공유xxx : 인스턴스변수
	int radius;
	final double PI=3.14; // 상수화
	double area;
	Circle(String name){ // 생성자 오버로딩
		this(name,1);
	}
	Circle(String name,int radius){
		this.name=name;
		this.radius=radius;
		this.area=this.radius*this.radius*this.PI;
	}
	void show() {
		System.out.println(this.name+"의 넓이는 "+this.area+"입니다.");
	}
	void sizeUp() {
		this.radius++;
		this.area=this.radius*this.radius*this.PI;
		System.out.println(this.name+", 사이즈업!");
	}
	void sizeUp(int radius) {
		this.radius+=radius;
		this.area=this.radius*this.radius*this.PI;
		System.out.println(this.name+", 사이즈업!");
	}
}

public class Test1 {

	public static void main(String[] args) {
		
		Circle c1=new Circle("도넛");
		Circle c2=new Circle("피자",10);
		
		c1.show();
		c2.show();
		
		c1.sizeUp();
		c1.show();
		
		c1.sizeUp(8);
		c1.show();
		
	}

}
