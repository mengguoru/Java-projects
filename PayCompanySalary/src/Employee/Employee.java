package Employee;

public abstract class Employee{
	private String name;
	private int hours;
	private char type;
	
	public Employee(String name,int hours,char type){
		this.name=name;
		this.hours=hours;
		this.type=type;
	}
	public int getHours(){
		return this.hours;
	}
	public String getType(char type){
		if(type=='a'){
			return "A����Ա";
		}else{
			return "B����Ա";
		}
	}
	public String getDetails(){
		String info;
		info="\n���֣�"+this.name
				+"\n����ʱ�䣺"+this.hours
				+"\n�������ͣ�"+getType(this.type);
		return info;
	}
}
