package Sample;

import java.awt.Point;

// Поток класса

class ThreadLamp extends Thread {
    private Point p1, p2, p3, p4;
    private boolean SunFlag = true;
    lampView lampView = new lampView();
    public boolean isSunFlag() {
        return SunFlag;
    }

    public void setSunFlag(boolean sunFlag) {
        SunFlag = sunFlag;
    }

    public ThreadLamp(String name, int meter) {
        super(name);
        p1 = new Point(0, 100);
        p2 = new Point(130, 100);
        p3 = new Point(260, 100);
        p4 = new Point(390, 100);
        lampView.SetPosition(p1, p2, p3, p4);
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
                System.out.println ("Реле завершено!");
        }
    }

    // Присваиваем значения графике
    public void dataSet(int i) {

        if (i < 100) {
            p1.x = i;
            lampView.SetPosition(p1, p2, p3, p4);
            // lampView.lamp2.setLocation(p1);
        } else if (i < 200) {
            p2.x = i + 30;
            lampView.SetPosition(p1, p2, p3, p4);
        } else if (i < 300) {
            p3.x = i + 60;
            lampView.SetPosition(p1, p2, p3, p4);
        } else if (i < 400) {
            p4.x = i + 90;
            lampView.SetPosition(p1, p2, p3, p4);
        }
    }

}

