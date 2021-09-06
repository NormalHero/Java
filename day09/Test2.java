
class TV{
	boolean power;
	int vol;
	String name;
	final int maxVol=100;
	final int minVol=0;
	TV(String name){
		this(name,50);
	}
	TV(String name,int vol){
		this.name=name;
		this.vol=vol;
		this.power=false;
	}
	void powerOnOff() {
		this.power=!this.power;
		if(this.power) {
			System.out.println("������ �������ϴ�!");
			return;
		}
		System.out.println("������ �������ϴ�..");
	}
	void volUp() {
		if(!this.power) {
			System.out.println("������ �����ֽ��ϴ�..");
			return;
		}
		this.vol++;
		if(this.vol>100) {
			this.vol=100;
		}
	}
	void volUp(int vol) {
		if(!this.power) {
			System.out.println("������ �����ֽ��ϴ�..");
			return;
		}
		this.vol+=vol;
		if(this.vol>100) {
			this.vol=100;
		}
	}
	void volDown() {
		if(!this.power) {
			System.out.println("������ �����ֽ��ϴ�..");
			return;
		}
		this.vol--;
		if(this.vol<0) {
			this.vol=0;
		}
	}
	void volDown(int vol) {
		if(!this.power) {
			System.out.println("������ �����ֽ��ϴ�..");
			return;
		}
		this.vol-=vol;
		if(this.vol<0) {
			this.vol=0;
		}
	}	
	void show() {
		System.out.print(this.name+"���� TV����: ");
		if(this.power) {
			System.out.print("ON");
		}
		else {
			System.out.print("OFF");
		}
		System.out.println(" ["+this.vol+"]");
	}
}
public class Test2 {

	public static void main(String[] args) {
		
		TV tv1=new TV("ȫ�浿");
		TV tv2=new TV("�Ӳ���",10);
		
		tv1.volUp();
		tv1.powerOnOff();
		tv1.volUp(20);
		tv1.show();
		
		tv2.show();
		
		
		
	}

}
