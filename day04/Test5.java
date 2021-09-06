
public class Test5 {

	public static void main(String[] args) {
	
/*
		int i=1;
		while(true) {
			i++;			
			if(i%2==1) {
				continue;
			}
			System.out.println(i);
			if(i==50) {
				break;
			}			
		}
*/
		int i=0;
		int sum=0;
		while(true) {
			i++;
			if(i%2==0) {
				continue;
			}
			sum+=i;
			if(i>=50) {
				break;
			}
		}
		System.out.println("총합은 "+sum+"입니다.");

	}

}
