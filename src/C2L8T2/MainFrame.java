package C2L8T2;


import javax.swing.*;

public class MainFrame extends JFrame {
    private EntryMenu mainPage;
    private Messenger messPage;
    private boolean flag = false;
    private boolean fillAddr = false;
    private String ip;
    private int port;
    private String message;



    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITlAB Application");
        setSize(500, 300);
        setLayout(null);
        mainPage = new EntryMenu(this);
        mainPage.setVisible(true);
        add(mainPage);

        messPage = new Messenger(this);
        messPage.setVisible(false);
        add(messPage);

    }
    public EntryMenu getMainPage() {
        return mainPage;
    }

    public Messenger getMessPage() {
        return messPage;
    }

    public void setFlag(Boolean flag){this.flag=flag;}

    public Boolean getFlag(){
        return flag;
    }

    public void setFillAddr(Boolean fillAddr){this.fillAddr=fillAddr;}

    public Boolean getFillAddr(){
        return fillAddr;
    }

    public void setIp(String ip){this.ip=ip;}
    public String getIp(){return ip;}

    public void setPort(int port){this.port=port;}

    public int getPort() {return port; }

    public void setMessage(String message){this.message=message;}
    public String getMessage(){return message;}
}
