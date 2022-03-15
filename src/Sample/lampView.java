package Sample;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// Создать интерфейс
class lampView extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel panelLamp1 = new JPanel();
    private JPanel panelLamp2 = new JPanel();
    private JPanel panelLamp3 = new JPanel();
    private JPanel panelLamp4 = new JPanel();

    public lampView() {
        super("Синхронизация потоков ---- реле 4 * 100");
        Container con = getContentPane();
        con.setLayout(null);
        //this.SetPosition(new Point(0,100),new Point(130,100),new Point(260,100),new Point(390,100));
        con.add(this.lamp1(panelLamp1,Color.blue));
        con.add(this.lamp1(panelLamp2,Color.green));
        con.add(this.lamp1(panelLamp3,Color.red));
        con.add(this.lamp1(panelLamp4,Color.yellow));
        JLabel Notice = new JLabel ("Нажмите S, чтобы запустить реле, нажмите Q, чтобы остановить реле");
        Notice.setLocation(200, 200);
        Notice.setSize(200,100);
        con.add(Notice);
        this.setSize(600, 350);
        this.setVisible(true);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // После закрытия программы закройте поток
    }

    // Данные модифицированы для внешнего доступа
    public void SetPosition(Point p1,Point p2,Point p3,Point p4) {
        this.panelLamp1.setLocation(p1);
        this.panelLamp2.setLocation(p2);
        this.panelLamp3.setLocation(p3);
        this.panelLamp4.setLocation(p4);
        //this.validate();
    }

    // Создание симулятора
    public JPanel lamp1(JPanel panel,Color color) {
        Dimension size = new Dimension(30, 30);
        JButton lamp1 = new JButton();
        panel.setLayout(new FlowLayout());
        lamp1.setBackground(color);
        lamp1.setPreferredSize(size);
        panel.add(lamp1);
        panel.setSize(30, 30);
        panel.setLocation(0,0);
        return panel;
    }
}
