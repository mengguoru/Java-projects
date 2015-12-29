package Employee;

public class HourlyEmployee extends Employee implements PaySalary{
	public HourlyEmployee(String name, int hours, char type) {
		super(name, hours, type);
		// TODO Auto-generated constructor stub
	}

	private double Salary;
	
	public double PayTheSalary(){
		this.Salary=20*getHours();
		return this.Salary;
	}
	public String getDetails(){
		String info;
		info=super.getDetails()
				+"\n¹¤×Ê£º"+PayTheSalary();
		return info;
		
	}
}