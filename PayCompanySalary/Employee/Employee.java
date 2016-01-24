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
			return "A类人员";
		}else{
			return "B类人员";
		}
	}
	public String getDetails(){
		String info;
		info="\n名字："+this.name
				+"\n工作时间："+this.hours
				+"\n工作类型："+getType(this.type);
		return info;
	}
}
