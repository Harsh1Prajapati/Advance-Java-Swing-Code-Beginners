import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Abcd extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t;
	JButton b;
	public Abcd()
{
	setTitle("My Factorial App");
	setLayout(new FlowLayout());
	l1=new JLabel("Enter Number:");
	t=new JTextField(10);
	l2=new JLabel("Result:");
	b=new JButton("Add");
	add(l1);
	add(t);
	add(l2);
	add(b);
	b.addActionListener(this);
	setVisible(true);
	setSize(250,250);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	public void actionPerformed(ActionEvent ae)
{
	int num=Integer.parseInt(t.getText());
	int value=1;
	for(int i=num;i>0;i--)
	{
	value = value*i;
	}
	l2.setText(""+value);
}
	public static void main(String args[])
	{
	Abcd a1=new Abcd();
	}
}