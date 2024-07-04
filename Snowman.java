
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snowman extends JPanel {

    @Override
    public void paint(Graphics g) {
        final int MID = 150;
        final int TOP = 50;

        setBackground(Color.CYAN);
        g.setColor(Color.BLUE);
        g.fillRect(0, 175, 300, 60); // ground

        g.setColor(Color.YELLOW);
        g.fillOval(-40, -40, 80, 80); // sun

        g.setColor(Color.WHITE);
        g.fillOval(MID - 20, TOP, 40, 40); // head
        g.fillOval(MID - 35, TOP + 35, 70, 50); // upper torso
        g.fillOval(MID - 50, TOP + 80, 100, 60); // lower torso

        g.setColor(Color.BLACK);
        g.fillOval(MID - 10, TOP + 10, 5, 5); // left eye
        g.fillOval(MID + 5, TOP + 10, 5, 5); // right eye

        g.drawArc(MID - 10, TOP + 20, 20, 10, 190, 160); // smile

        g.drawLine(MID - 25, TOP + 60, MID - 50, TOP + 40); // left arm
        g.drawLine(MID + 25, TOP + 60, MID + 55, TOP + 60); // right arm

        g.drawLine(MID - 20, TOP + 5, MID + 20, TOP + 5); // brim of hat
        g.fillRect(MID - 15, TOP - 20, 30, 25); // top of hat

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Snowman());
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
