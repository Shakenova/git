package C2L6T2Relocation;

import java.awt.Point;


public class ThreadLabel extends Thread{
    private Point p1;
    MainFrame frame = new MainFrame();
    boolean flag;



    public ThreadLabel(String name, MainFrame frame, boolean flag) {
        super(name);
        this.frame=frame;
        this.flag=flag;
        p1 = new Point(50, 40);
        frame.setTitle(name);
        frame.getLabelGoPagePage().setVisible(true);
        frame.getLabelGoPagePage().SetPosition(p1);
    }

    public void run() {
            if(flag==true) {
                System.out.println("Начало " + getName());
                for (int i = 0; i < 400; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.dataSet(i);
                    if (i == 399)
                        System.out.println("Конец!");
                }
            }

    }

    public void dataSet(int i) {

        p1.x = i+50;
        frame.getLabelGoPagePage().SetPosition(p1);

    }
}




