
class TicketSystem implements Runnable{

	Ticketting t=new Ticketting();
	
	@Override
	public void run() {
		t.buy();
	}
	
}
class Ticketting{
	static int ticket=1; // Ŭ���� ������ ��� ��ü���� �����ϴ� ������(�����ڿ�)
	synchronized void buy() { // ����ȭ �۾�
		if(ticket>0) {
			System.out.println(Thread.currentThread().getName()+"��, ���༺��!");
			ticket--;
		}
		else {
			System.out.println(Thread.currentThread().getName()+"��, �̹� ���õ� �¼��Դϴ�...�Ф�");
		}
		System.out.println(Thread.currentThread().getName()+"��, ���� Ƽ�ϼ�: "+ticket);
	}
}


public class Test2 {

	public static void main(String[] args) {
	
		TicketSystem sys=new TicketSystem();
		
		Thread p1=new Thread(sys,"ȫ�浿");
		Thread p2=new Thread(sys,"�ƹ���");
		Thread p3=new Thread(sys,"�Ӳ���");
		
		p1.start();
		p2.start();
		p3.start();
		
	}

}
