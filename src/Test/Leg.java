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


public class Leg {
    private final String name;
    private final long delay;

    public Leg(String name, long delay) {
        this.name = name;
        this.delay = delay;
    }

    public String getName() {
        return name;
    }

    public long getDelay() {
        return delay;
    }

}

