
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("클래스로 만든 스레드 "+i);
		}
	}
	
}
class MyThread2 implements Runnable{ // Thread클래스의 생성자 인수로 전달될수있게, 필요한 요소를 강제

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("인터페이스로 만든 스레드 "+i);
			/*
			try {
				Thread.sleep(500); // 1000==1초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
		}
	}
	// 인터페이스가 가지는 강한 [강제성]
	//  : 추상메서드
	
}
public class Test1 {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread(); // [생성] -> [대기]
		// t1 == 스레드 객체(인스턴스)
		MyThread2 t2=new MyThread2();
		Thread t3=new Thread(t2);
		
		t1.setPriority(1); // 우선순위 낮음
		t3.setPriority(10); // 우선순위 높음
		// 우선순위가 높다면, 가급적 먼저 처리
		
		
		t1.start(); // start() 메서드로 스레드를 동작 -> run() 메서드가 수행됨
		// [수행]
		//  -> [데드]
		t3.start();
		
		
		
		
		
	}

}
