
class Person{
	String name;
	void show() {
		System.out.println("사람클래스");
	}
	void call(Animal a) {
		a.speak();
	}
}
class Student extends Person{
	int score;
	void show() {
		System.out.println("학생클래스");
	}
}
class Animal{
	String name;
	void speak() {
		System.out.println("울음소리를 낸다.");
	}
}
class Dog extends Animal{
	Dog(){
		this.name="멍멍이";
	}
	void speak() {
		System.out.println(this.name+" 멍멍!");
	}
}
class Cat extends Animal{
	Cat(){
		this.name="야옹이";
	}
	void speak() {
		System.out.println(this.name+" 야옹~~");
	}
}

public class Test5 {

	public static void main(String[] args) {
		/*
		Person c1=new Student();
		c1.show(); // 동적바인딩
		*/
		
		Person p=new Person();
		
		Animal a1=new Dog();
		Animal a2=new Cat();
		
		p.call(a1);
		p.call(a2);
		// "다형성"이 구현되었다.
		
		
		Animal[] data=new Animal[3];
		data[0]=new Dog();
		data[1]=new Cat();
		data[2]=new Dog();
		for(Animal v:data) {
			v.speak(); // 동적바인딩 -> 다형성 실현
		}
		
		
		
	}

}
