/*
 * input   : Lession'name and score
 * output  : average
 *
 * note    : but if it use Student Class Array maybe better(while name and score can be attribute
*/
import java.util.*;
public class LessionAndScore{
	public static void main(String[] args){
		//initialize two array:Name Score
		ArrayList<String>subjectName=new ArrayList<>();
		ArrayList<Integer>subjectScore=new ArrayList<>();
		double average=0;
		int total=0;

		Scanner sc=new Scanner(System.in);
		String receive = sc.nextLine();
		while(receive.equals("End")==false)
		{
			subjectName.add(receive);
			subjectScore.add(sc.nextInt());
			sc.nextLine();
			average+=subjectScore.get(total);
			total++;
			receive=sc.nextLine();
		}
		sc.close();

		average/=total;
		for(int i=0;i<total;i++)
			System.out.println(subjectName.get(i)+" "+subjectScore.get(i));
		System.out.println(average);
	}
}
