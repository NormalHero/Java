
class A{
	String title;
	int time;
	/*
	A(){
		this.title="�̹���";
		this.time=0;
	}
	A(int time){
		this.title="�������";
		this.time=time;
	}
	A(String title){
		this.title=title;
		this.time=3;
	}
	*/
	A(){
		this("�̹���",0); // this() -> ������
		System.out.println("�⺻������ ȣ���!");
	}
	A(int time){
		this("�������",time); // this()�� ������� �ۼ��ؾ���! -> "�ʱ�ȭ"�� �����ض�!
		System.out.println("������1 ȣ���!");
	}
	A(String title){
		this(title,3);
		System.out.println("������2 ȣ���!");
	}
	A(String title,int time){
		this.title=title;
		this.time=time;
		System.out.println("������3 ȣ���!");
	}
	void show() {
		System.out.println(this.title+": "+this.time+"�ð�");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		A a1=new A(4);
		a1.show();
		
		A a2=new A("���빮���� ����");
		a2.show();
		
		A a3=new A("�̼��̷�",2);
		a3.show();
		
		A a4=new A();
		a4.show();
		
		
		
	}

}
