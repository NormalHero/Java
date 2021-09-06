// [상속]
class Person{
	protected String name; // protected: 본인클래스+자식클래스까지만 접근가능
	String getName() {
		return this.name;
	}
	void hello() {
		System.out.println("안녕하세요!");
	}
//	Person(){
//		System.out.println("부모클래스의 기본생성자 호출됨!");
//	}
	Person(String name){
		this.name=name;
		//System.out.println("부모클래스의 생성자 호출됨!");
	}
}

class Student extends Person{
	int score;
	void hello() {
		System.out.println("ㅎㅇㅎㅇ");
	}
	void study() {
		System.out.println(this.getName()+"학생은 공부중.......");
	}
	Student(){
		this("무명",0);
	}
	Student(String name){
		this(name,0);
	}
	Student(String name,int score){
		super(name);
		this.score=score;
	}
	void show() {
		System.out.println(this.name+"학생의 점수는 "+this.score+"점입니다.");
	}
}

public class Test2 {

	public static void main(String[] args) {
		
		Student s0=new Student();
		Student s1=new Student("홍길동");
		Student s2=new Student("임꺽정",50);
		
		s0.hello();
		
		s0.show();
		s1.show();
		s2.show();
		
		
	}

}
