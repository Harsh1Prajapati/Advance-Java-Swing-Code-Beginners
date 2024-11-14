import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Fibonacci extends JFrame implements ActionListener 
{
    JLabel l1, l2;
    JTextField t;
    JButton b;

    public Fibonacci() 
{
	setTitle("My Fibonacci App");
        setLayout(new FlowLayout());
        l1 = new JLabel("Enter Number:");
        t = new JTextField(10);
        l2 = new JLabel("Result");
        b = new JButton("Calculate");
        add(l1);
        add(t);
        add(l2);
        add(b);
        b.addActionListener(this);
        setVisible(true);
        setSize(300, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    public void actionPerformed(ActionEvent e) 
{
        int a = Integer.parseInt(t.getText());
        int b = 0;
        int c = 1;
        int d = 0;
        if (a == 1) {
            d = 0;
        } else if (a == 2) {
            d = 1;
        } else {
            for (int i = 3; i <= a; i++) {
                d = b + c;
                b = c;
                c = d;
            }
        }
        l2.setText("" + d);
}

    public static void main(String args[]) 
	{
        new Fibonacci();
	}
}
