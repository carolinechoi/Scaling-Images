import javax.swing.*;
import java.awt.*;

public class SadBearx2
{
    public static void main(String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;

        win = new JFrame("Not Everything Is Political, Caroline");
        win.setSize(600, 600);
        win.setLocation(100, 100);
        win.setVisible(true);

        contentPane = win.getContentPane();
        g = contentPane.getGraphics();

        try {
            Thread.sleep(400);
        }
        catch(Exception e) {}

        // setting background color
        g.setColor(new Color(306, 276, 306)); //color must be set before the object you want to create in that color
        g.fillRect(0, 0, 600, 600);
        
        // hill
        g.setColor(new Color(306, 306, 306));
        g.fillRect(0, 360, 600, 420);

        // sun
        g.setColor(Color.YELLOW);
        g.fillOval(312, 84, 84, 84);
        Polygon ray1 = new Polygon();
        ray1.addPoint(228, 108);
        ray1.addPoint(228, 84);
        ray1.addPoint(288, 108);
        g.fillPolygon(ray1);

        Polygon ray2 = new Polygon();
        ray2.addPoint(324, 60);
        ray2.addPoint(288, 36);
        ray2.addPoint(318, 30);
        g.fillPolygon(ray2);

        Polygon ray3 = new Polygon();
        ray3.addPoint(300, 156);
        ray3.addPoint(276, 192);
        ray3.addPoint(288, 204);
        g.fillPolygon(ray3);

        Polygon ray4 = new Polygon();
        ray4.addPoint(378, 20);
        ray4.addPoint(402, 36);
        ray4.addPoint(368, 72);
        g.fillPolygon(ray4);

        // pond
        g.setColor(new Color(244, 274, 306));
        g.fillOval(480, 456, 120, 120);
        g.fillOval(420, 408, 228, 60);
        g.fillOval(360, 420, 228, 60);
        g.fillOval(300, 444, 360, 72);
        g.fillOval(240, 480, 480, 84);
        g.fillOval(180, 522, 600, 60);
        g.fillOval(420, 360, 540, 84);
        g.fillOval(420, 240, 600, 600);

        // ice block
        g.setColor(new Color(183, 183, 306));
        Polygon blk1 = new Polygon();
        blk1.addPoint(360, 120);
        blk1.addPoint(540, 48);
        blk1.addPoint(660, 216);
        g.fillPolygon(blk1);
        g.fillRect(360, 120, 240, 240);

        // melting
        g.setColor(new Color(244, 274, 306));
        Polygon drop1 = new Polygon();
        drop1.addPoint(420, 156);
        drop1.addPoint(426, 120);
        drop1.addPoint(432, 156);
        g.fillPolygon(drop1);
        g.fillOval(420, 151, 12, 18);

        Polygon drop2 = new Polygon();
        drop2.addPoint(540, 276);
        drop2.addPoint(546, 240);
        drop2.addPoint(552, 276);
        g.fillPolygon(drop2);
        g.fillOval(540, 271, 12, 18);

        // ice block 2
        g.setColor(new Color(244, 244, 306));
        Polygon blk2 = new Polygon();
        blk2.addPoint(312, 276);
        blk2.addPoint(372, 228);
        blk2.addPoint(408, 258);
        blk2.addPoint(450, 204);
        blk2.addPoint(478, 204);
        blk2.addPoint(480, 276);
        g.fillPolygon(blk2);
        g.fillRect(312, 276, 168, 108);

        // melting
        g.setColor(new Color(244, 274, 306));
        Polygon drop3 = new Polygon();
        drop3.addPoint(360, 324);
        drop3.addPoint(366, 288);
        drop3.addPoint(372, 324);
        g.fillPolygon(drop3);
        g.fillOval(360, 319, 12, 18);

        Polygon drop4 = new Polygon();
        drop4.addPoint(444, 396);
        drop4.addPoint(450, 360);
        drop4.addPoint(456, 396);
        g.fillPolygon(drop4);

        // bear cave
        g.setColor(new Color(232, 232, 256));
        g.fillOval(-42, 240, 264, 228);
        g.fillRect(-42, 360, 264, 108);

        g.setColor(new Color(61, 61, 92));
        g.fillOval(-18, 300, 204, 168);
        g.fillRect(-18, 402, 204, 66);

        // big bear
        g.setColor(new Color(306, 306, 244));
        g.fillOval(48, 372, 120, 84); // body
        g.fillOval(141, 352, 55, 55); // head
        g.fillOval(152, 356, 51, 42); // snout
        g.fillOval(32, 396, 24, 24); // tail
        g.fillOval(141, 350, 20, 20); // ear
        g.fillOval(162, 348, 20, 20); // ear
        g.fillRect(51, 420, 27, 60); // leg
        g.fillRect(132, 420, 27, 60); // leg
        
        g.setColor(Color.BLACK);
        g.fillOval(198, 372, 12, 12); // nose
        g.fillOval(168, 369, 9, 9); // eye
    }
}
