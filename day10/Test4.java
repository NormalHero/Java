
/*
private : 자기자신클래스내에서만 접근가능
default : 동일패키지에서 접근가능(기본상태)
protected : 동일패키지+상속받은 클래스까지 접근가능
public : 모든곳에서 접근가능
*/

class A{
	
	private int abc;
	private String def;
	private double ghi;

	public int getAbc() {
		return abc;
	}
	public void setAbc(int abc) {
		this.abc = abc;
	}
	public String getDef() {
		return def;
	}
	public void setDef(String def) {
		this.def = def;
	}
	public double getGhi() {
		return ghi;
	}
	public void setGhi(double ghi) {
		this.ghi = ghi;
	}

}
class Account{
	private String name;
	private int bal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
}
public class Test4 {

	public static void main(String[] args) {

		Account a=new Account();
		a.setName("홍길동");
		a.setBal(10000);
		System.out.println(a.getName()+"님의 잔액은 "+a.getBal()+"원입니다.");
		a.setBal(500);
		System.out.println(a.getName()+"님의 잔액은 "+a.getBal()+"원입니다.");

	}

}
