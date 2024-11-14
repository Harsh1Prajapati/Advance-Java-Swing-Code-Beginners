import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ItemEvent;

class MyFrame extends JFrame implements ItemListener{
JComboBox c;
MyFrame()
{
setLayout(new FlowLayout());
String cities[]={"Amaravati","Mumbai","Pune","Nasik"};
c = new JComboBox(cities);
c.addItem("Tirupati");
c.addItem("Lalganj");
c.setEditable(true);
add(c);
c.addItemListener(this);
}

public void itemStateChanged(ItemEvent e)
{
JOptionPane.showMessageDialog(null,c.getSelectedItem(),"Info",JOptionPane.INFORMATION_MESSAGE);
}
}

public class JComboBoxDemo{
public static void main(String[] args){
MyFrame f = new MyFrame();
f.setSize(500,500);
f.setTitle("Frame Example");
f.setVisible(true);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}