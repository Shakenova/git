package Lesson1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JButton button;
    private JLabel label;
    //private JLabel labelPhone;
    private JTextField textFieldName;
    private JTextField textFieldPhone;
    private JComboBox agesBox;
    private Integer[] ages = new Integer[101];
    private JTextArea area;

    public MainFrame(){
        for (Integer i=0; i<=100; i++){
         ages[i]=i;
        }
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB Application");
        setSize(500, 550);
        setLayout(null);

        label = new JLabel("Name: ");
        label.setSize(100, 30);
        label.setLocation(50,80);
        add(label);

        textFieldName = new JTextField("");
        textFieldName.setSize(300, 30);
        textFieldName.setLocation(100, 80);
        add(textFieldName);

        label = new JLabel("Phone: ");
        label.setSize(100, 30);
        label.setLocation(50,120);
        add(label);

        textFieldPhone = new JTextField("");
        textFieldPhone.setSize(300, 30);
        textFieldPhone.setLocation(100, 120);
        add(textFieldPhone);

        label = new JLabel("Age: ");
        label.setSize(100, 30);
        label.setLocation(50,160);
        add(label);

        agesBox = new JComboBox(ages);
        agesBox.setSize(300, 30);
        agesBox.setLocation(100, 160);
        add(agesBox);

        area = new JTextArea("");
        area.setSize(425,200);
        area.setLocation(25, 280 );
        add(area);

        button = new JButton("ADD CONTACT");
        button.setSize(350, 30);
        button.setLocation(50, 220);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String text = area.getText();
                String text1 = textFieldName.getText();
                String  text2= textFieldPhone.getText();
                Integer age = (Integer) agesBox.getSelectedItem();
                if(!text1.equals("") && !text2.equals("") && age!=0){
                    area.append(text1+" - "+text2+ " - "+age+" years\n");
                    textFieldName.setText("");
                    textFieldPhone.setText("");
                    agesBox.setSelectedIndex(0);
                }
            }
        });
        add(button);
    }

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        //Обязательно вызываем метод setVisible(true), так как по дефолту окно невидно
        frame.setVisible(true);
    }
}

