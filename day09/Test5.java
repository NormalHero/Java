
// [°´Ã¼¹è¿­]

class A{
	int i;
	String s;
	A(int i,String s){
		this.i=i;
		this.s=s;
	}
	void show() {
		System.out.println(this.i+":"+this.s);
	}
}
public class Test5 {

	public static void main(String[] args) {
		
		A[] a=new A[3];
		
		for(int i=0;i<a.length;i++) {
			a[i]=new A(i+1,"apple");
		}
		
		for(A v:a) {
			v.show();
		}
		
		
	}

}
