package 简单的学生注册系统;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RegisterGui extends JFrame implements ActionListener {
	JTextField studentId,name,majorAndClass,phoneNum;
	JTextArea studentId0,name0,majorAndClass0,phoneNum0;
	JButton addUserBtn;
	public RegisterGui(){
		super();
		Container c=this.getContentPane();
		c.setLayout(new GridLayout(5,2));
		
		studentId0=new JTextArea("学号:");
		name0=new JTextArea("名字：");
		majorAndClass0=new JTextArea("班级及班号");
		phoneNum0=new JTextArea("电话号码");
		studentId=new JTextField(10);
		name=new JTextField(10);
		majorAndClass=new JTextField(10);
		phoneNum=new JTextField(10);
		addUserBtn=new JButton("添加");
		c.add(studentId0);
		c.add(studentId);
		c.add(name0);
		c.add(name);
		c.add(majorAndClass0);
		c.add(majorAndClass);
		c.add(phoneNum0);
		c.add(phoneNum);
		c.add(addUserBtn);
		addUserBtn.addActionListener(this);
		this.setSize(400,360);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==addUserBtn){
			int temp1=Integer.parseInt(studentId.getText());
			String temp2=name.getText();
			String temp3=majorAndClass.getText();
			String temp4=phoneNum.getText();
			Student temp5=new Student(temp1,temp2,temp3,temp4);
			UserDA da = new UserDA();
			
			try {
				da.add(temp5);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		new RegisterGui();
	}
}
