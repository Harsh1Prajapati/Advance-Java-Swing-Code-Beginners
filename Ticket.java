import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ticket extends JFrame implements ItemListener {
    JComboBox<String> sourceLines, destLines, sourcePlatforms, destPlatforms;
    JButton b;

    String[][] Platforms = {
        {"CST", "Masjid Bunder", "Marine Lines"},
        {"Churchgate", "Mumbai Central", "Mahalaxmi"},
        {"Vashi", "Belapur", "Panvel"}
    };

    Ticket() {
        String[] Lines = {"Central", "Western", "Harbour"};

        sourceLines = new JComboBox<>(Lines);
        destLines = new JComboBox<>(Lines);
        sourcePlatforms = new JComboBox<>();
        destPlatforms = new JComboBox<>();

        b = new JButton("Book");

        JLabel sourceLineLabel = new JLabel("Source Line:");
        JLabel sourcePlatformLabel = new JLabel("Source Platform:");
        JLabel destLineLabel = new JLabel("Destination Line:");
        JLabel destPlatformLabel = new JLabel("Destination Platform:");

        sourceLineLabel.setBounds(50, 50, 100, 20);
        add(sourceLineLabel);

        sourceLines.setBounds(150, 50, 100, 20);
        add(sourceLines);

        sourcePlatformLabel.setBounds(50, 80, 100, 20);
        add(sourcePlatformLabel);

        sourcePlatforms.setBounds(150, 80, 100, 20);
        add(sourcePlatforms);

        destLineLabel.setBounds(50, 110, 100, 20);
        add(destLineLabel);

        destLines.setBounds(150, 110, 100, 20);
        add(destLines);

        destPlatformLabel.setBounds(50, 140, 100, 20);
        add(destPlatformLabel);

        destPlatforms.setBounds(150, 140, 100, 20);
        add(destPlatforms);

        b.setBounds(100, 170, 100, 20);
        add(b);

        sourceLines.addItemListener(this);
        destLines.addItemListener(this);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sourceLine = (String) sourceLines.getSelectedItem();
                String destLine = (String) destLines.getSelectedItem();
                String sourcePlatform = (String) sourcePlatforms.getSelectedItem();
                String destPlatform = (String) destPlatforms.getSelectedItem();

                String message = "Source Line: " + sourceLine + "\nSource Platform: " + sourcePlatform +
                        "\nDestination Line: " + destLine + "\nDestination Platform: " + destPlatform +
                        "\nTicket Fare: ₹20";
                JOptionPane.showMessageDialog(Ticket.this, message, "Train Ticket", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        sourceLines.setSelectedIndex(0);
        destLines.setSelectedIndex(0);

        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == sourceLines) {
            int sourceIndex = sourceLines.getSelectedIndex();
            sourcePlatforms.removeAllItems();
            for (String platform : Platforms[sourceIndex]) {
                sourcePlatforms.addItem(platform);
            }
        } else if (e.getSource() == destLines) {
            int destIndex = destLines.getSelectedIndex();
            destPlatforms.removeAllItems();
            for (String platform : Platforms[destIndex]) {
                destPlatforms.addItem(platform);
            }
        }
    }

    public static void main(String[] args) {
        new Ticket();
    }
}