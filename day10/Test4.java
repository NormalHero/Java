
/*
private : �ڱ��ڽ�Ŭ������������ ���ٰ���
default : ������Ű������ ���ٰ���(�⺻����)
protected : ������Ű��+��ӹ��� Ŭ�������� ���ٰ���
public : �������� ���ٰ���
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
		a.setName("ȫ�浿");
		a.setBal(10000);
		System.out.println(a.getName()+"���� �ܾ��� "+a.getBal()+"���Դϴ�.");
		a.setBal(500);
		System.out.println(a.getName()+"���� �ܾ��� "+a.getBal()+"���Դϴ�.");

	}

}
