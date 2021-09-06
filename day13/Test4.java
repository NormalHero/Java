import java.util.ArrayList;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Integer> alist=new ArrayList();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("점수입력: ");
			int score=sc.nextInt();
			if(score<0 || 100<score) {
				break;
			}
			alist.add(score);
		}

		int sum=0;
		for(int v:alist) {
			sum+=v;
		}
		double avg=sum*1.0/alist.size();
		
		System.out.println("학생은 "+alist.size()+"명, 총합 "+sum+"점, 평균 "+avg+"점");
		
	}

}
