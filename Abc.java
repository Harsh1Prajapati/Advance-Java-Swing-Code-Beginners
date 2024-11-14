import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Abc extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	JButton b;
	public Abc()
{
	setTitle("My Addtion App");
	setLayout(new FlowLayout());
	l1=new JLabel("Enter 1st Number:");
	t1=new JTextField(10);
	l2=new JLabel("Enter 2nd Number:");
	t2=new JTextField(10);
	l3=new JLabel("Result:");
	t3=new JTextField(10);
	b=new JButton("Add");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	add(t3);
	add(b);
	b.addActionListener(this);
	setVisible(true);
	setSize(250,350);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public void actionPerformed(ActionEvent ae)
{
	int num1=Integer.parseInt(t1.getText());
	int num2=Integer.parseInt(t2.getText());
	int value=num1+num2;
	t3.setText(""+value);
}
	public static void main(String args[])
	{
	Abc a1=new Abc();
	}
}