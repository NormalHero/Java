import java.util.concurrent.SynchronousQueue;

class GameSystem implements Runnable{

	Game g=new Game();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		g.play();
	}
	
}
class Game{
	static int game=2;
	synchronized void play() {
		if(game<=0) {
			System.out.println(Thread.currentThread().getName()+"��, ���ӿ���...");
		}
		else {
			game--;
			System.out.println("����!");
		}
	}	
}

public class Test3 {

	public static void main(String[] args) {
		
		GameSystem sys=new GameSystem();
		
		Thread p1=new Thread(sys,"ȫ�浿");
		Thread p2=new Thread(sys,"�ƹ���");
		Thread p3=new Thread(sys,"�Ӳ���");
		
		
		p1.start();
		p2.start();
		p3.start();
		
		
	}

}
