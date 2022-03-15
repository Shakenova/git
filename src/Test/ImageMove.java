package Test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ImageMove implements Runnable {

    private JFrame frame;

    private JourneyRunnable journeyRunnable;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new ImageMove());
    }

    @Override
    public void run() {
        frame = new JFrame("Image Move");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                exitProcedure();
            }
        });

        DrawingPanel drawingPanel = new DrawingPanel();
        frame.add(drawingPanel);

        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);

        journeyRunnable = new JourneyRunnable(drawingPanel, new Journey());
        new Thread(journeyRunnable).start();
    }

    public void exitProcedure() {
        journeyRunnable.setRunning(false);
        frame.dispose();
        System.exit(0);
    }
}
