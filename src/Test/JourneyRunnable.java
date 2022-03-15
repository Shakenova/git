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
public class JourneyRunnable implements Runnable {

    private boolean running;

    private DrawingPanel drawingPanel;

    private Journey journey;

    public JourneyRunnable(DrawingPanel drawingPanel, Journey journey) {
        this.drawingPanel = drawingPanel;
        this.journey = journey;
        this.running = true;
    }

    @Override
    public void run() {
        while (running) {
            Leg leg = journey.getLeg();
            setLeg(leg);
            sleep(leg);
        }
    }

    public void setLeg(final Leg leg) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                drawingPanel.setLeg(leg);
            }
        });
    }

    private void sleep(Leg leg) {
        try {
            Thread.sleep(leg.getDelay());
        } catch (InterruptedException e) {

        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

}


