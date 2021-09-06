
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
			System.out.println("����off����");
			return;
		}
		this.vol+=20;
		if(this.vol>max) {
			System.out.println("�ִ뺼������");
			this.vol=max;
		}
	}
	@Override
	public void volDown() {
		if(!this.power) {
			System.out.println("����off����");
			return;
		}
		this.vol-=20;
		if(this.vol<=min) {
			System.out.println("�ּҺ�������");
			this.vol=min;
		}
	}
	@Override
	public void powerOnOff() {
		if(this.power==on) {
			System.out.println("������ ���ϴ�..");
			this.power=off;
		}
		else {
			System.out.println("������ �մϴ�..");
			this.power=on;
		}
	}
	void show() {
		System.out.println("����: "+this.vol+" ["+this.power+"]");
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
