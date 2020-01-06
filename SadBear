import javax.swing.*;
import java.awt.*;

public class SadBear
{
    public static void main(String[] args)
    {
        JFrame win;
        Container contentPane;
        Graphics g;

        win = new JFrame("Not Everything Is Political, Caroline");
        win.setSize(500, 500);
        win.setLocation(100, 100);
        win.setVisible(true);

        contentPane = win.getContentPane();
        g = contentPane.getGraphics();

        try {
            Thread.sleep(400);
        }
        catch(Exception e) {}

        // setting background color
        g.setColor(new Color(255, 230, 255)); //color must be set before the object you want to create in that color
        g.fillRect(0, 0, 500, 500);
        
        // hill
        g.setColor(new Color(255, 255, 255));
        g.fillRect(0, 300, 500, 350);

        // sun
        g.setColor(Color.YELLOW);
        g.fillOval(260, 70, 70, 70);
        Polygon ray1 = new Polygon();
        ray1.addPoint(190, 90);
        ray1.addPoint(190, 70);
        ray1.addPoint(240, 90);
        g.fillPolygon(ray1);

        Polygon ray2 = new Polygon();
        ray2.addPoint(270, 50);
        ray2.addPoint(240, 30);
        ray2.addPoint(265, 25);
        g.fillPolygon(ray2);

        Polygon ray3 = new Polygon();
        ray3.addPoint(250, 130);
        ray3.addPoint(230, 160);
        ray3.addPoint(240, 170);
        g.fillPolygon(ray3);

        Polygon ray4 = new Polygon();
        ray4.addPoint(315, 17);
        ray4.addPoint(335, 30);
        ray4.addPoint(307, 60);
        g.fillPolygon(ray4);

        // pond
        g.setColor(new Color(204, 229, 255));
        g.fillOval(400, 380, 100, 100);
        g.fillOval(350, 340, 190, 50);
        g.fillOval(300, 350, 190, 50);
        g.fillOval(250, 370, 300, 60);
        g.fillOval(200, 400, 400, 70);
        g.fillOval(150, 435, 500, 50);
        g.fillOval(350, 300, 450, 70);
        g.fillOval(350, 200, 500, 500);

        // ice block
        g.setColor(new Color(153, 153, 255));
        Polygon blk1 = new Polygon();
        blk1.addPoint(300, 100);
        blk1.addPoint(450, 40);
        blk1.addPoint(550, 180);
        g.fillPolygon(blk1);
        g.fillRect(300, 100, 200, 200);

        // melting
        g.setColor(new Color(204, 229, 255));
        Polygon drop1 = new Polygon();
        drop1.addPoint(350, 130);
        drop1.addPoint(355, 100);
        drop1.addPoint(360, 130);
        g.fillPolygon(drop1);
        g.fillOval(350, 126, 10, 15);

        Polygon drop2 = new Polygon();
        drop2.addPoint(450, 230);
        drop2.addPoint(455, 200);
        drop2.addPoint(460, 230);
        g.fillPolygon(drop2);
        g.fillOval(450, 226, 10, 15);

        // ice block 2
        g.setColor(new Color(204, 204, 255));
        Polygon blk2 = new Polygon();
        blk2.addPoint(260, 230);
        blk2.addPoint(310, 190);
        blk2.addPoint(340, 215);
        blk2.addPoint(375, 170);
        blk2.addPoint(399, 170);
        blk2.addPoint(400, 230);
        g.fillPolygon(blk2);
        g.fillRect(260, 230, 140, 90);

        // melting
        g.setColor(new Color(204, 229, 255));
        Polygon drop3 = new Polygon();
        drop3.addPoint(300, 270);
        drop3.addPoint(305, 240);
        drop3.addPoint(310, 270);
        g.fillPolygon(drop3);
        g.fillOval(300, 266, 10, 15);

        Polygon drop4 = new Polygon();
        drop4.addPoint(370, 330);
        drop4.addPoint(375, 300);
        drop4.addPoint(380, 330);
        g.fillPolygon(drop4);

        // bear cave
        g.setColor(new Color(194, 194, 214));
        g.fillOval(-35, 200, 220, 190);
        g.fillRect(-35, 300, 220, 90);

        g.setColor(new Color(51, 51, 77));
        g.fillOval(-15, 250, 170, 140);
        g.fillRect(-15, 335, 170, 55);

        // big bear
        g.setColor(new Color(255, 255, 204));
        g.fillOval(40, 310, 100, 70); // body
        g.fillOval(118, 294, 46, 46); // head
        g.fillOval(127, 297, 43, 35); // snout
        g.fillOval(27, 330, 20, 20); // tail
        g.fillOval(118, 292, 17, 17); // ear
        g.fillOval(135, 290, 17, 17); // ear
        g.fillRect(43, 350, 23, 50); // leg
        g.fillRect(110, 350, 23, 50); // leg
        
        g.setColor(Color.BLACK);
        g.fillOval(165, 310, 10, 10); // nose
        g.fillOval(140, 308, 8, 8); // eye
    }
}
