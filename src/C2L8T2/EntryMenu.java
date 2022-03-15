package C2L8T2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryMenu extends JPanel {
    private MainFrame parent;

    private JButton button;
    private JLabel label;
    private JTextField textFieldIP;
    private JTextField textFieldPort;

    private boolean fillAddr = false;

    public EntryMenu(MainFrame parent){
        this.parent=parent;

        setSize(500, 300);
        setLayout(null);

        label = new JLabel("IP:");
        label.setSize(100, 30);
        label.setLocation(50, 40);
        add(label);

        textFieldIP = new JTextField("Must be <localhost>");
        textFieldIP.setSize(300,30);
        textFieldIP.setLocation(120, 40);
        add(textFieldIP);

        label = new JLabel("PORT:");
        label.setSize(100, 30);
        label.setLocation(50,80);
        add(label);

        textFieldPort = new JTextField("Must be <3333>");
        textFieldPort.setSize(300, 30);
        textFieldPort.setLocation(120, 80);
        add(textFieldPort);



        button = new JButton("CONNECT");
        button.setSize(300,30);
        button.setLocation(100,200);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String ip = textFieldIP.getText();
                int port = Integer.parseInt(textFieldPort.getText());
                fillAddr = true;
                parent.setIp(ip);
                parent.setPort(port);
                parent.setFillAddr(fillAddr);
                parent.getMainPage().setVisible(false);
                parent.getMessPage().setVisible(true);

            }
        });
    }

}
