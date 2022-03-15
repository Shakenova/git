package C2L6T2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    boolean flag = false;



    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 360);
        setLayout(null);





        label = new JLabel("#");
        label.setSize(100, 30);
        label.setLocation(50,80);
        add(label);

        button = new JButton("FIRE");
        button.setSize(350, 30);
        button.setLocation(50, 220);


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag = true;
            }
        });
        add(button);


   }

    // Данные модифицированы для внешнего доступа
    public void SetPosition(Point p1) {
        this.label.setLocation(p1);
        //this.validate();
    }

}
