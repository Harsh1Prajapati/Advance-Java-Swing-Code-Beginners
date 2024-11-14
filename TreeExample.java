import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample extends JFrame{
TreeExample(){

DefaultMutableTreeNode VIT = new DefaultMutableTreeNode("VIT");
DefaultMutableTreeNode INFT = new DefaultMutableTreeNode("INFT");
DefaultMutableTreeNode CMPN = new DefaultMutableTreeNode("CMPN");
DefaultMutableTreeNode EXTC = new DefaultMutableTreeNode("EXTC");
DefaultMutableTreeNode EXCS = new DefaultMutableTreeNode("EXCS");

VIT.add(INFT); VIT.add(CMPN); VIT.add(EXTC); VIT.add(EXCS);

DefaultMutableTreeNode aA = new DefaultMutableTreeNode("A");
DefaultMutableTreeNode bB = new DefaultMutableTreeNode("B");
DefaultMutableTreeNode cC = new DefaultMutableTreeNode("C");

DefaultMutableTreeNode aaA = new DefaultMutableTreeNode("A");
DefaultMutableTreeNode bbB = new DefaultMutableTreeNode("B");
DefaultMutableTreeNode ccC = new DefaultMutableTreeNode("C");

DefaultMutableTreeNode Aa = new DefaultMutableTreeNode("A");
DefaultMutableTreeNode Bb = new DefaultMutableTreeNode("B");
DefaultMutableTreeNode Cc = new DefaultMutableTreeNode("C");

DefaultMutableTreeNode Aaa = new DefaultMutableTreeNode("A");
DefaultMutableTreeNode Bbb = new DefaultMutableTreeNode("B");
DefaultMutableTreeNode Ccc = new DefaultMutableTreeNode("C");

INFT.add(aA); INFT.add(bB); INFT.add(cC);
CMPN.add(aaA); CMPN.add(bbB); CMPN.add(ccC);
EXTC.add(Aa); EXTC.add(Bb); EXTC.add(Cc);
EXCS.add(Aaa); EXCS.add(Bbb); EXCS.add(Ccc);

JTree T = new JTree(VIT);
add(T);

setSize(200,200);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args){
new TreeExample();
}}