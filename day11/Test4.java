
interface usePower{
	boolean on=true;
	boolean off=false;
	void powerOnOff();
}
interface useVol{
	int min=0;
	int max=100;
	void volUp();
	void volDown();
}
class TV implements usePower,useVol{
	boolean power;
	int vol;
	TV(){
		this.power=false;
		this.vol=50;
	}
	@Override
	public void volUp() {
		if(!this.power) {
			System.out.println("전원off상태");
			return;
		}
		this.vol+=20;
		if(this.vol>max) {
			System.out.println("최대볼륨상태");
			this.vol=max;
		}
	}
	@Override
	public void volDown() {
		if(!this.power) {
			System.out.println("전원off상태");
			return;
		}
		this.vol-=20;
		if(this.vol<=min) {
			System.out.println("최소볼륨상태");
			this.vol=min;
		}
	}
	@Override
	public void powerOnOff() {
		if(this.power==on) {
			System.out.println("전원을 끕니다..");
			this.power=off;
		}
		else {
			System.out.println("전원을 켭니다..");
			this.power=on;
		}
	}
	void show() {
		System.out.println("볼륨: "+this.vol+" ["+this.power+"]");
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		TV tv=new TV();
		tv.show();
		tv.volUp();
		tv.powerOnOff();
		tv.volUp();
		tv.volUp();
		tv.volUp();
		tv.show();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.volDown();
		tv.show();
		tv.powerOnOff();
		tv.volDown();
		tv.show();
		
		
	}

}
