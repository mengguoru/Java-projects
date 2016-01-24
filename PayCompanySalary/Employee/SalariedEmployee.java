package Employee;
public class SalariedEmployee extends Employee implements PaySalary{
	public SalariedEmployee(String name, int hours, char type) {
		super(name, hours, type);
		// TODO Auto-generated constructor stub
	}

	private double Salary;
	
	public double PayTheSalary(){
		this.Salary=700.0;
		return this.Salary;
	}
	public String getDetails(){
		String info;
		info=super.getDetails()
				+"\n¹¤×Ê£º"+PayTheSalary();
		return info;
		
	}
}