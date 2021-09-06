class Point{
	String color;
	int x;
	int y;
	Point(){
		this("검정",0,0);
	}
	Point(String color){
		this(color,0,0);
	}
	Point(int x,int y){
		this("검정",x,y);
	}
	Point(String color,int x,int y){
		this.color=color;
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return this.color+"("+this.x+","+this.y+")";
	}
	@Override
	public boolean equals(Object obj) {
		Point p=(Point)obj;
		if(p.color==this.color&&p.x==this.x&&p.y==this.y) {
			return true;
		}
		return false;
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		Point[] data=new Point[4];
		data[0]=new Point();
		data[1]=new Point("파랑");
		data[2]=new Point(0,0);
		data[3]=new Point("초록",0,0);
		for(Point v:data) {
			System.out.println(v);
		}
		for(int i=1;i<data.length;i++) {
			if(data[0].equals(data[i])) {
				System.out.println("같음");
			}
			else {
				System.out.println("다름");
			}
		}
	}

}