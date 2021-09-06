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
			System.out.println(Thread.currentThread().getName()+"´Ô, °ÔÀÓ¿À¹ö...");
		}
		else {
			game--;
			System.out.println("¼º°ø!");
		}
	}	
}

public class Test3 {

	public static void main(String[] args) {
		
		GameSystem sys=new GameSystem();
		
		Thread p1=new Thread(sys,"È«±æµ¿");
		Thread p2=new Thread(sys,"¾Æ¹«¹«");
		Thread p3=new Thread(sys,"ÀÓ²©Á¤");
		
		
		p1.start();
		p2.start();
		p3.start();
		
		
	}

}
