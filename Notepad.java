import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Notepad extends JFrame implements ActionListener
{
JMenuBar mb;
JMenu file,edit,help;
JMenuItem cut,copy,paste,selectAll;
JTextArea ta;

Notepad()
{
mb = new JMenuBar();
file = new JMenu("file");
edit = new JMenu("edit");
help = new JMenu("help");

cut = new JMenuItem("cut");
copy = new JMenuItem("copy");
paste = new JMenuItem("paste");
selectAll = new JMenuItem("selectAll");

copy.addActionListener(this);
cut.addActionListener(this);
paste.addActionListener(this);
selectAll.addActionListener(this);

ta = new JTextArea();
ta.setBounds(5,5,360,320);

mb.add(file); mb.add(edit); mb.add(help);

edit.add(cut); edit.add(copy); edit.add(paste); edit.add(selectAll);

setJMenuBar(mb);
setLayout(null);
add(ta);
setVisible(true);
setSize(400,400);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==cut)
ta.cut();
if(e.getSource()==copy)
ta.copy();
if(e.getSource()==paste)
ta.paste();
if(e.getSource()==selectAll)
ta.selectAll();
}

public static void main(String args[]){
new Notepad();
}
}