//Generate Random numbers && find out the max & min
import java.util.Random;
public class RandomAndCompare {
	public static void main(String[] args)
	{
		int i,TheMax=0,TheMin = 0;
		int[] a=new int[10];
		Random n=new Random();
		for(i=0;i<10;i++){
			a[i]=n.nextInt(100);
			System.out.print(a[i]+" ");
			if(a[i]>TheMax)
				TheMax=a[i];
			if(i==0){
				TheMin=TheMax=a[i];
			}
			if(a[i]<TheMin)
				TheMin=a[i];
		}
		System.out.print("\nThe biggest number:"+TheMax+"\nThe smallest:"+TheMin);
//		for(i=0;i<10;i++){
//			System.out.print(a[i]+":");
//		}
	}
}
