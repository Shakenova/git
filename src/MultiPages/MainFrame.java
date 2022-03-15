package MultiPages;

import javax.swing.*;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private MainMenu mainMenuPage;
    private AddStudent addStudentPage;
    private ListStudents listStudentsPage;
    private int index=0;
    //private Students std = new Students();

    private ArrayList<Students> students = new ArrayList<>();

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITlAB Application");
        setSize(500, 500);
        setLayout(null);
        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        addStudentPage = new AddStudent(this);
        addStudentPage.setVisible(false);
        add(addStudentPage);

        listStudentsPage = new ListStudents(this);
        listStudentsPage.setVisible(false);
        add(listStudentsPage);

    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public AddStudent getAddStudentPage() {
        return addStudentPage;
    }

    public ListStudents getListStudentsPage() {
        return listStudentsPage;
    }
//    public void setIndex(){
//        this.index = index;
//    }
//    public int getIndex(){return index;}

    public ArrayList<Students> getStudents() {

        return (students);
    }

    public void setStudents(Students s) {
        this.students.add(s);
        //index=index+1;

    }
}
