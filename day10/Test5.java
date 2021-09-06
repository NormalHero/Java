
class Person{
	String name;
	void show() {
		System.out.println("���Ŭ����");
	}
	void call(Animal a) {
		a.speak();
	}
}
class Student extends Person{
	int score;
	void show() {
		System.out.println("�л�Ŭ����");
	}
}
class Animal{
	String name;
	void speak() {
		System.out.println("�����Ҹ��� ����.");
	}
}
class Dog extends Animal{
	Dog(){
		this.name="�۸���";
	}
	void speak() {
		System.out.println(this.name+" �۸�!");
	}
}
class Cat extends Animal{
	Cat(){
		this.name="�߿���";
	}
	void speak() {
		System.out.println(this.name+" �߿�~~");
	}
}

public class Test5 {

	public static void main(String[] args) {
		/*
		Person c1=new Student();
		c1.show(); // �������ε�
		*/
		
		Person p=new Person();
		
		Animal a1=new Dog();
		Animal a2=new Cat();
		
		p.call(a1);
		p.call(a2);
		// "������"�� �����Ǿ���.
		
		
		Animal[] data=new Animal[3];
		data[0]=new Dog();
		data[1]=new Cat();
		data[2]=new Dog();
		for(Animal v:data) {
			v.speak(); // �������ε� -> ������ ����
		}
		
		
		
	}

}
