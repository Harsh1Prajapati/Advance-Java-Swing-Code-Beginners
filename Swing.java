import javax.swing.*;
import java.awt.event.*;

class Swing {
    public static void main(String args[]) {
        JFrame f = new JFrame("Swing Components Example");

        JLabel label = new JLabel("Enter your name:");
        label.setBounds(50, 50, 150, 20);

        JTextField textField = new JTextField();
        textField.setBounds(200, 50, 150, 20);

        JButton button = new JButton("Submit");
        button.setBounds(50, 100, 100, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(f, "Hello, " + name + "!");
            }
        });

        JCheckBox checkBox = new JCheckBox("I agree to the terms and conditions");
        checkBox.setBounds(50, 150, 300, 30);

        JRadioButton radioButton1 = new JRadioButton("Option 1");
        radioButton1.setBounds(50, 200, 100, 30);
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        radioButton2.setBounds(150, 200, 100, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);

        f.add(label);
        f.add(textField);
        f.add(button);
        f.add(checkBox);
        f.add(radioButton1);
        f.add(radioButton2);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
