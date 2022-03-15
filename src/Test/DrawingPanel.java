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
public class DrawingPanel extends JPanel {

    private static final long serialVersionUID = -8498462824787395933L;

    private int xPos, yPos, width, height;

    private Leg leg;

    public DrawingPanel() {
        this.width = 100;
        this.height = 50;
        this.xPos = 0;
        this.yPos = (200 - height) / 2;
        this.setPreferredSize(new Dimension(800, 200));
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
        this.xPos += 10;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(Color.ORANGE);
        g.fillRect(xPos, yPos, width, height);

        if (leg != null) {
            g.setColor(Color.BLACK);
            centerString(g, new Rectangle(xPos, yPos, width, height),
                    leg.getName(), g.getFont());
        }
    }
    /**
     * This method centers a <code>String</code> in a bounding
     * <code>Rectangle</code>.
     *
     * @param g
     *            - The <code>Graphics</code> instance.
     * @param r
     *            - The bounding <code>Rectangle</code>.
     * @param s
     *            - The <code>String</code> to center in the bounding
     *            rectangle.
     * @param font
     *            - The display font of the <code>String</code>
     *
     * @see java.awt.Graphics
     * @see java.awt.Rectangle
     * @see java.lang.String
     */
    public void centerString(Graphics g, Rectangle r, String s, Font font) {
        FontRenderContext frc = new FontRenderContext(null, true, true);

        Rectangle2D r2D = font.getStringBounds(s, frc);
        int rWidth = (int) Math.round(r2D.getWidth());
        int rHeight = (int) Math.round(r2D.getHeight());
        int rX = (int) Math.round(r2D.getX());
        int rY = (int) Math.round(r2D.getY());

        int a = (r.width / 2) - (rWidth / 2) - rX;
        int b = (r.height / 2) - (rHeight / 2) - rY;

        g.setFont(font);
        g.drawString(s, r.x + a, r.y + b);
    }
}
