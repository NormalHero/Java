
class Ch{
	String name;
	private int lv; // ����������
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
		this.name="ĳ����";
		this.exp=0;
	}
	void attack() {
		System.out.println("����!");
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
		this.name="����";
		this.wp=wp;
	}
	void attack() {
		System.out.println(this.wp+"��(��) ����Ѵ�.");
	}
}
class He extends Ch{
	He(){
		this(5);
	}
	He(int lv){
		super(lv);
		this.name="����";
	}
	void heal() {
		System.out.println("ġ����...++");
	}
}

public class Test3 {

	public static void main(String[] args) {
		
	
		Ch c=new Ch();
		System.out.println(c.getLv());
		c.setLv(100);
		c.show();
		
		De d=new De(10,"��");
		d.attack();
		d.show();
		
		He h=new He();
		h.attack();
		h.heal();
		h.show();
		
		
		
		
		
		
	}

}
