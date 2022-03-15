package C2L6T2Relocation;

import javax.swing.*;

public class MainFrame extends JFrame {
    public String getIp;
    private MainMenu mainMenuPage;
    private LabelGoPage labelGoPage;
    private boolean flag = false;


    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITlAB Application");
        setSize(500, 300);
        setLayout(null);
        mainMenuPage = new MainMenu(this);
        mainMenuPage.setVisible(true);
        add(mainMenuPage);

        labelGoPage = new LabelGoPage(this);
        labelGoPage.setVisible(false);
        add(labelGoPage);


    }

    public MainMenu getMainMenuPage() {
        return mainMenuPage;
    }

    public LabelGoPage getLabelGoPagePage() {
        return labelGoPage;
    }

    public void setFlag(Boolean flag){this.flag=flag;}

    public Boolean isFlag(){
        return flag;
    }

}
