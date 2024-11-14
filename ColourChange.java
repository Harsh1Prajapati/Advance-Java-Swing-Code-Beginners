import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ColourChange extends JFrame implements ActionListener
{
	JButton b,b1,b2,b3,b4;
	public ColourChange()
	{
	setLayout(new FlowLayout());
	b=new JButton("Blue");
	b1=new JButton("Cyan");
	b2=new JButton("Red");
	b3=new JButton("Pink");
	b4=new JButton("Yellow");
	add(b); add(b1); add(b2); add(b3); add(b4);
	b.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getActionCommand()=="Blue"){
	getContentPane().setBackground(Color.BLUE);}
	if(ae.getActionCommand()=="Cyan"){
	getContentPane().setBackground(Color.CYAN);}
	if(ae.getActionCommand()=="Red"){
	getContentPane().setBackground(Color.RED);}
	if(ae.getActionCommand()=="Pink"){
	getContentPane().setBackground(Color.PINK);}
	if(ae.getActionCommand()=="Yellow"){
	getContentPane().setBackground(Color.YELLOW);}
	}
	public static void main(String args[])
	{
	new ColourChange();
	}
}