package 简单的用户管理系统;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDA {
	static Student aStudent;
	static String url="jdbc:mysql://127.0.0.1:3306/testuserlist";
	static Connection aCon;
	static Statement aSta;
	
	//User attribure value
	static int studentId;
	static String name;
	static String majorAndClass;
	static String phoneNum;
	
	public static Connection init() throws SQLException{
		Connection aCon=DriverManager.getConnection(url, "root", "root12");
		aSta=aCon.createStatement();
		return aCon;
	}
	//add a new student
	public static void add(Student aStu) throws SQLException{
		studentId=aStu.getStudentId();
		name=aStu.getName();
		majorAndClass=aStu.getMajorAndClass();
		phoneNum=aStu.getPhoneNum();
		
		String sql="insert into studentregister (studentId,name,majorAndClass,phoneNum) values("+studentId+",'"+name+"','"+majorAndClass+"','"+phoneNum+"')";
		System.out.println(sql);
		aSta.execute(sql);
	}
	public static void terminate() throws SQLException{
		aSta.close();
		aCon.close();
	}
}
