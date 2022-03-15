package MultiPages;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddStudent extends JPanel {
    private MainFrame parent;

    private JLabel label;

    private JButton buttonAdd;
    private JButton buttonBack;

    private JTextField textFieldId;
    private JTextField textFieldName;
    private JTextField textFieldSurname;
    private JTextField textFieldGroup;

    private JTextArea area;

    private JComboBox faculty;
    private String faculties[] = {"CSSE", "Computer Science", "Information Systems" };

    public AddStudent(MainFrame parent){
        this.parent=parent;

        setSize(500,500);
        setLayout(null);

        label = new JLabel("ID:");
        label.setSize(100, 30);
        label.setLocation(50, 40);
        add(label);

        textFieldId = new JTextField("");
        textFieldId.setSize(300,30);
        textFieldId.setLocation(120, 40);
        add(textFieldId);

        label = new JLabel("NAME:");
        label.setSize(100, 30);
        label.setLocation(50,80);
        add(label);

        textFieldName = new JTextField("");
        textFieldName.setSize(300, 30);
        textFieldName.setLocation(120, 80);
        add(textFieldName);

        label = new JLabel("SURNAME: ");
        label.setSize(100, 30);
        label.setLocation(50,120);
        add(label);

        textFieldSurname = new JTextField("");
        textFieldSurname.setSize(300, 30);
        textFieldSurname.setLocation(120, 120);
        add(textFieldSurname);

        label = new JLabel("FACULTY:");
        label.setSize(100, 30);
        label.setLocation(50,160);
        add(label);

        faculty = new JComboBox(faculties);
        faculty.setSize(300, 30);
        faculty.setLocation(120, 160);
        add(faculty);

        label = new JLabel("GROUP:");
        label.setSize(100,30);
        label.setLocation(50, 200);
        add(label);

        textFieldGroup = new JTextField("");
        textFieldGroup.setSize(300,30);
        textFieldGroup.setLocation(120, 200);
        add(textFieldGroup);

        buttonAdd = new JButton("ADD");
        buttonAdd.setSize(125,30);
        buttonAdd.setLocation(100, 350);
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Students s = new Students(Integer.parseInt(textFieldId.getText()), textFieldName.getText(),textFieldSurname.getText(),(String) faculty.getSelectedItem(), textFieldGroup.getText() );
                parent.setStudents(s);
                textFieldId.setText("");
                textFieldName.setText("");
                textFieldSurname.setText("");
                textFieldGroup.setText("");
            }
        });

        add(buttonAdd);

        buttonBack = new JButton("BACK");
        buttonBack.setSize(125,30);
        buttonBack.setLocation(275, 350);
        add(buttonBack);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getAddStudentPage().setVisible(false);
                parent.getMainMenuPage().setVisible(true);
            }
        });
    }

}
