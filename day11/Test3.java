/*
���߻�� ����xxx -> ��ȣ��
��Ӱ���� ������ �����

[�������̽�]-> ���߻�� ����o
 : Ŭ������ �����ؾ��ϴ� �޼������ ����
   "���ȭ" ���α׷����� ����
*/
interface inter{ // �ַ� Ŭ������ ��ɸ�
	int i=10; // �������̽��� ��������� ��� ����̸�, �ʱ�ȭ�� �ݵ�� �ؾ���
	public static final int ii=100;
	// public: Ŭ������ ���̿����� ��ȣ�ۿ��� ���
	// static: ��ü�� ������
	// final: ���ȭ.�� ���� �Ұ���
	void func();
	public abstract void func2();
	// public: Ŭ������ ���̿����� ��ȣ�ۿ��� ���
	// abstract: [������]�� �ο�->�������̵�(������)�� �ؾ߸��ϰ� ����
	//            => "������" ��������
}
abstract class A{
	void f1() {
		System.out.println("�ȳ��ϼ���!");
	}
	abstract void f2();
}
class C extends A implements inter {
	public void func() {
		// ��Ӱ��迡 �ִ� �͵��� �ݵ�� �θ𺸴� �ڽ��� ���������� �� �о����
		// �θ� <= �ڽ�
	}
	public void func2() {
	}
	
	void f2() {
	}
}

public class Test3 {

	public static void main(String[] args) {
		
		C c=new C();
		
		
	}

}
