
class Ch{
	String name;
	private int lv; // 접근지정자
	// -> getter,setter
	protected int exp;
	
	int getLv() {
		return this.lv;
	}
	void setLv(int lv) {
		this.lv=lv;
	}
	
	Ch(){
		this(5);
	}
	Ch(int lv){
		this.lv=lv;
		this.name="캐릭터";
		this.exp=0;
	}
	void attack() {
		System.out.println("공격!");
	}
	void show() {
		System.out.println(this.name+" Lv."+this.lv);
	}
}
class De extends Ch{
	String wp;
	De(String wp){
		this(5,wp);
	}
	De(int lv,String wp){
		super(lv);
		this.name="딜러";
		this.wp=wp;
	}
	void attack() {
		System.out.println(this.wp+"을(를) 사용한다.");
	}
}
class He extends Ch{
	He(){
		this(5);
	}
	He(int lv){
		super(lv);
		this.name="힐러";
	}
	void heal() {
		System.out.println("치료중...++");
	}
}

public class Test3 {

	public static void main(String[] args) {
		
	
		Ch c=new Ch();
		System.out.println(c.getLv());
		c.setLv(100);
		c.show();
		
		De d=new De(10,"총");
		d.attack();
		d.show();
		
		He h=new He();
		h.attack();
		h.heal();
		h.show();
		
		
		
		
		
		
	}

}
