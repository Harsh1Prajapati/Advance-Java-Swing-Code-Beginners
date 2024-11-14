import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calc extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2,b3,b4,b5;
	public Calc()
{
	setLayout(new FlowLayout());
	l1=new JLabel("Enter 1st Number:");
	t1=new JTextField(10);
	l2=new JLabel("Enter 2nd Number:");
	t2=new JTextField(10);
	l3=new JLabel("Result");
	b1=new JButton("Add");
	b2=new JButton("Sub");
	b3=new JButton("Multi");
	b4=new JButton("Divide");
	b5=new JButton("Reset");
	add(l1); add(t1); add(l2); add(t2); add(l3);
	add(b1); add(b2); add(b3); add(b4); add(b5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	setSize(300,200);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("My Calc");
	getContentPane().setBackground(Color.CYAN);
}
	public void actionPerformed(ActionEvent z)
{
	int a=Integer.parseInt(t1.getText());
	int b=Integer.parseInt(t2.getText());
	int c=a+b;
	int d=a-b;
	int e=a*b;
	int f=a/b;
	if(z.getSource()==b1){
	l3.setText(""+c);}
	if(z.getSource()==b2){
	l3.setText(""+d);}
	if(z.getSource()==b3){
	l3.setText(""+e);}
	if(z.getSource()==b4){
	l3.setText(""+f);}
	if(z.getSource()==b5){
	t1.setText("");
	t2.setText("");
	l3.setText("Result");}
}
	public static void main(String args[])
	{
	new Calc();
	}
}