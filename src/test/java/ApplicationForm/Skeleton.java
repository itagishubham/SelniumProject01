package ApplicationForm;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Skeleton extends JFrame implements ActionListener{
	
	//initialize  buttons, panels , and textFields 
	JButton bu1 ;
	JLabel userLab , pasLab ;
	JPanel jpanel ;
	JTextField textField1 , textField2 ;
	
	
	Skeleton(){
		userLab = new JLabel();
		userLab.setText("Name");
		//to get name from user create create textFild
		textField1= new  JTextField (10);
		
		pasLab = new JLabel();
		pasLab.setText("Password");
		//to get name from user create create textFild
		textField2= new  JTextField (10);
		bu1 = new JButton("submit");
		//creating panel to assign all fields 
		
		jpanel  = new JPanel(new GridLayout(3,1));
		
		jpanel.add(userLab);
		jpanel.add(textField1);
		jpanel.add(pasLab);
		jpanel.add(textField2);
		jpanel.add(bu1);
		add(jpanel , BorderLayout.CENTER);
		
		bu1.addActionListener(this);
		setTitle("SubmissionForm");
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String userName= textField1.getText();
		String passWord= textField2.getText();
		
		
	}
	
	
	
	

}
