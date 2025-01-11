package Lab3;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/*
<applet code="TrackPointerApplet" width="500" height="500">
</applet>
*/

public class TrackPointerApplet extends Applet {
    // Variables to store click position
    private int x = -1, y = -1;

    @Override
    public void init() {
        // Set background color of the applet
        setBackground(Color.WHITE);

        // Add mouse listener to detect clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Store the x and y position of the click
                x = e.getX();
                y = e.getY();
                repaint(); // Request re-drawing to display the new circle
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        // If a click has been recorded, draw a circle
        if (x != -1 && y != -1) {
            g.setColor(Color.RED);
            g.fillOval(x - 20, y - 20, 40, 40); // Draw a circle at the clicked position
            g.setColor(Color.BLACK);
            g.drawString("Clicked at: (" + x + ", " + y + ")", x - 20, y - 30); // Show coordinates
        }
    }
}
