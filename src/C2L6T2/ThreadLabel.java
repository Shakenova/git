package C2L6T2;


import sun.font.TrueTypeFont;

import java.awt.Point;
import java.awt.*;

public class ThreadLabel extends Thread{
    private Point p1;
    private boolean SunFlag = true;
    MainFrame frame = new MainFrame();

    public boolean isSunFlag() {
        return SunFlag;
    }

    public void setSunFlag(boolean sunFlag) {
        SunFlag = sunFlag;
    }

    public ThreadLabel(String name) {
        super(name);
        p1 = new Point(50, 80);
        frame.setVisible(true);
        frame.SetPosition(p1);
    }

    // Переписать прогон
    public void run() {
        System.out.println ("Начало " + getName () + SunFlag);
        for (int i = 0; i < 400; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.dataSet(i);
            if(SunFlag==false)break;
            if(i==399)
                System.out.println ("Завершено!");
        }
    }

    // Присваиваем значения графике
    public void dataSet(int i) {

        //if (i < 100) {
            p1.x = i;
            frame.SetPosition(p1);
            // lampView.lamp2.setLocation(p1);
//        } else if (i < 200) {
//            p2.x = i + 30;
//            lampView.SetPosition(p1, p2, p3, p4);
//        } else if (i < 300) {
//            p3.x = i + 60;
//            lampView.SetPosition(p1, p2, p3, p4);
//        } else if (i < 400) {
//            p4.x = i + 90;
//            lampView.SetPosition(p1, p2, p3, p4);
//        }
    }
}




