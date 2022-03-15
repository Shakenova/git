package C2L6T2Relocation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainMenu extends JPanel {
    private MainFrame parent;

    private JButton button;
    private JLabel label;
    private boolean flag = false;

    public MainMenu(MainFrame parent){
        this.parent=parent;

        setSize(500, 300);
        setLayout(null);

        label = new JLabel("#");
        label.setSize(100, 30);
        label.setLocation(50, 40);
        add(label);


        button = new JButton("FIRE");
        button.setSize(300,30);
        button.setLocation(100,200);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                flag = true;
                parent.setFlag(flag);
                parent.getMainMenuPage().setVisible(false);
                parent.getLabelGoPagePage().setVisible(true);

            }
        });
    }



}