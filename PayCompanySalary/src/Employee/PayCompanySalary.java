package Employee;

import java.util.*;
public class PayCompanySalary {
	public static void main(String[] args){
//		int i;
//		ArrayList<SalariedEmployee>myArr1=new ArrayList<SalariedEmployee>();
//		ArrayList<HourlyEmployee>myArr2=new ArrayList<HourlyEmployee>();
//		Scanner scan=new Scanner(System.in);
//		
//		
//		//如何建立循环以解决动态添加数组又能输入null时自动退出循环？
//		System.out.print("输入名字（不输入时结束）：");
//		String a1=scan.nextLine();
//		while(a1!= null){
//			System.out.print("输入名字（不输入时结束）：");
//			String a1=scan.nextLine();
//			System.out.print("输入工作时间");
//			int b=scan.nextInt();
//			System.out.println("输入工作类型");
//			String c=scan.next();
//			i++;
//		}
		SalariedEmployee myArr11=new SalariedEmployee("mengguoru",100,'a');
		System.out.print(myArr11.getDetails());
	}
}
