import javax.swing.*;
import java.awt.event.*;

class One {
    public static void main(String args[]) {
        JFrame f = new JFrame("My New Code");

        JButton b = new JButton("Submit");
        JLabel l = new JLabel("Any Suggestion?");
        JRadioButton r = new JRadioButton("Male");
        JRadioButton r1 = new JRadioButton("Female");
        JCheckBox c = new JCheckBox("I agree that your code is good");
        JTextField t = new JTextField();

        ButtonGroup g = new ButtonGroup();
        g.add(r);
        g.add(r1);

        l.setBounds(50, 20, 200, 30);
        t.setBounds(50, 60, 300, 30);
        b.setBounds(50, 100, 100, 30);
        r.setBounds(50, 140, 100, 30);
        r1.setBounds(150, 140, 100, 30);
        c.setBounds(50, 180, 300, 30);

        f.add(l);
        f.add(t);
        f.add(b);
        f.add(r);
        f.add(r1);
        f.add(c);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
