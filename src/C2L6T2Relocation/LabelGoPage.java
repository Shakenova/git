package C2L6T2Relocation;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelGoPage extends JPanel {
    private MainFrame parent;
    private JLabel label;

    private JButton buttonExit;

    public LabelGoPage(MainFrame parent){
        this.parent=parent;

        setSize(500,300);
        setLayout(null);

        label = new JLabel("#");
        label.setSize(100, 30);
        label.setLocation(50, 40);
        add(label);

        buttonExit = new JButton("EXIT");
        buttonExit.setSize(300,30);
        buttonExit.setLocation(100,200);
        add(buttonExit);
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
    public void SetPosition(Point p1) {
        this.label.setLocation(p1);
    }
}
