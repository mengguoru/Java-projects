package 简单的学生注册系统;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class UserDA {
	Properties pros = null;
	Connection aCon = null;
	PreparedStatement aSta = null ;
	
	//User attribure value
	static int studentId;
	static String name;
	static String majorAndClass;
	static String phoneNum;

	//add a new student
	public void add(Student aStu) throws SQLException{
		studentId=aStu.getStudentId();
		name=aStu.getName();
		majorAndClass=aStu.getMajorAndClass();
		phoneNum=aStu.getPhoneNum();

		try {
//			File d = new File(".");
//			System.out.println(System.getProperty("user.dir"));
			pros = new Properties();

//			String tmp = System.getProperty("user.dir") + "\\db.properties";
//			File f = new File(tmp);
//			try(InputStream f2 = new FileInputStream(f))
//			{
//				pros.load(f2);
//			}catch (Exception e)
//			{
//				e.printStackTrace();
//			}
			//pros.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(tmp));
			InputStream is = this.getClass().getClassLoader().getResourceAsStream("db.properties");
			pros.load(is);

			//加载驱动
			Class.forName(pros.getProperty("mysqlDriver"));

			aCon = DriverManager.getConnection(pros.getProperty("mysqlURL"), pros.getProperty("mysqlUser"), pros.getProperty("mysqlPwd"));
			aSta = aCon.prepareStatement("insert into studentregister (studentId,name,majorAndClass,phoneNum) values(?, ?, ?, ?)");
			aSta.setInt(1, studentId);
			aSta.setString(2, name);
			aSta.setString(3, majorAndClass);
			aSta.setString(4, phoneNum);
			//String sql="insert into studentregister (studentId,name,majorAndClass,phoneNum) values("+studentId+",'"+name+"','"+majorAndClass+"','"+phoneNum+"')";
			System.out.println(aSta.toString());
			aSta.execute();
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			if(null != aSta)
				aSta.close();
			if(null != aCon)
				aCon.close();
		}
	}
}
