import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/* description : Simple GUI Calculator
 * function    :  '+' '-' '*' '/'
 */

public class SimpleCalculator extends JFrame implements ActionListener{
	JTextField num1Text,num2Text;
	JButton calBtn;
	JTextArea resultText;
	JComboBox typeOperater;
	
	public SimpleCalculator(){
		super("Simple Calculator");
		
		Container c=this.getContentPane();
		c.setLayout(new FlowLayout());
		
		num1Text=new JTextField(5);
		num2Text=new JTextField(5);
		typeOperater=new JComboBox();
		typeOperater.addItem("+");
		typeOperater.addItem("-");
		typeOperater.addItem("*");
		typeOperater.addItem("/");
		calBtn=new JButton("Cal");
		resultText=new JTextArea("result:");
		
		//add component to container
		c.add(num1Text);
		c.add(typeOperater);
		c.add(num2Text);
		c.add(calBtn);
		c.add(resultText);
		//
		calBtn.addActionListener(this);
		
		this.setSize(400,100);
		this.setVisible(true);
	}
	
	public static void main(String args[]){
		new SimpleCalculator();
	}
	
	// ActionListener
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==calBtn){
			//
			try {
				calculate();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private void calculate() throws Exception {
		try{
			String msg1=num1Text.getText();
			String msg2=num2Text.getText();
			double n1=Integer.parseInt(msg1),
					n2=Integer.parseInt(msg2);
			double result;
			String t=typeOperater.getSelectedItem().toString();
			if(t=="+"){
				result=n1+n2;
			}else if(t=="-"){
				result=n1-n2;
			}else if(t=="*"){
				result=n1*n2;
			}else{
				result=n1/n2;
			}
			resultText.setText("result:"+result);
		}catch(Exception e){
			Exception e1=new Exception("input error");
			throw(e1);
		}
	}
}