
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Ŭ������ ���� ������ "+i);
		}
	}
	
}
class MyThread2 implements Runnable{ // ThreadŬ������ ������ �μ��� ���޵ɼ��ְ�, �ʿ��� ��Ҹ� ����

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("�������̽��� ���� ������ "+i);
			/*
			try {
				Thread.sleep(500); // 1000==1��
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
		}
	}
	// �������̽��� ������ ���� [������]
	//  : �߻�޼���
	
}
public class Test1 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread(); // [����] -> [���]
		// t1 == ������ ��ü(�ν��Ͻ�)
		MyThread2 t2=new MyThread2();
		Thread t3=new Thread(t2);
		
		t1.setPriority(1); // �켱���� ����
		t3.setPriority(10); // �켱���� ����
		// �켱������ ���ٸ�, ������ ���� ó��
		
		
		t1.start(); // start() �޼���� �����带 ���� -> run() �޼��尡 �����
		// [����]
		//  -> [����]
		t3.start();
		
		
		
		
		
	}

}
