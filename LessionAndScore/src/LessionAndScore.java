//input Lession'name and score,output average
//but if it use Student Array maybe better(while name and score are attribute
import java.util.*;
public class LessionAndScore{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<String>subjectName=new ArrayList<>();
		ArrayList<Integer>subjectScore=new ArrayList<>();
		String receive;
		receive=sc.nextLine();
		double average=0;
		int total=0;
		while(receive.equals("End")==false)
		{
			subjectName.add(receive);
			subjectScore.add(sc.nextInt());
			sc.nextLine();
			average+=subjectScore.get(total);
			total++;
			receive=sc.nextLine();
		}
		average/=total;
		for(int i=0;i<total;i++)
			System.out.println(subjectName.get(i)+" "+subjectScore.get(i));
		System.out.println(average);
	}
}