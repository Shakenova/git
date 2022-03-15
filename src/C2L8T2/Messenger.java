package C2L8T2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Messenger extends JPanel {
    private MainFrame parent;
    private JTextField textFieldMessage;
    private JButton sendButton;
    private boolean flag=false;

    public Messenger(MainFrame parent) {
        this.parent = parent;
        parent.setFlag(false);

        setSize(500, 300);
        setLayout(null);

        textFieldMessage = new JTextField("");
        textFieldMessage.setSize(300,30);
        textFieldMessage.setLocation(100, 40);
        add(textFieldMessage);

        sendButton = new JButton("SEND");
        sendButton.setSize(300,30);
        sendButton.setLocation(100,200);
        add(sendButton);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String message = textFieldMessage.getText();
                parent.setMessage(message);
                flag = true;
                parent.setFlag(flag);
                parent.setFillAddr(false);


            }
        });



    }
}
