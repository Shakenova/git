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
public class Journey {

    private int index;
    private List<Leg> legs;

    public Journey() {
        this.legs = new ArrayList<>();

        this.legs.add(new Leg("Name 1", 2000L));
        this.legs.add(new Leg("Name 2", 1000L));
        this.legs.add(new Leg("Name 3", 2000L));
        this.legs.add(new Leg("Name 4", 1000L));
        this.legs.add(new Leg("Name 5", 2000L));
        this.legs.add(new Leg("Name 6", 1000L));
        this.legs.add(new Leg("Name 7", 2000L));
        this.legs.add(new Leg("Name 8", 1000L));
        this.legs.add(new Leg("Name 9", 2000L));
        this.legs.add(new Leg("Name 10", 1000L));

        this.index = 0;
    }

    public Leg getLeg() {
        Leg leg = legs.get(index);
        index = ++index % legs.size();
        return leg;
    }
}