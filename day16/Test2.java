
class TicketSystem implements Runnable{

	Ticketting t=new Ticketting();
	
	@Override
	public void run() {
		t.buy();
	}
	
}
class Ticketting{
	static int ticket=1; // 클래스 변수로 모든 객체들이 공유하는 데이터(공유자원)
	synchronized void buy() { // 동기화 작업
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"님, 예약성공!");
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"님, 이미 선택된 좌석입니다...ㅠㅠ");
		}
		System.out.println(Thread.currentThread().getName()+"님, 남은 티켓수: "+ticket);
	}
}


public class Test2 {

	public static void main(String[] args) {
	
		TicketSystem sys=new TicketSystem();
		
		Thread p1=new Thread(sys,"홍길동");
		Thread p2=new Thread(sys,"아무무");
		Thread p3=new Thread(sys,"임꺽정");
		
		p1.start();
		p2.start();
		p3.start();
		
	}

}
