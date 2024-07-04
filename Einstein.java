
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Einstein extends JPanel {

    @Override
    public void paint(Graphics g) {
        g.drawRect(50, 50, 40, 40);
        g.drawRect(60, 80, 225, 30);
        g.drawOval(75, 65, 20, 20);
        g.drawLine(35, 60, 100, 120);

        g.drawString("Out of clutter, find simplicity.", 110, 70);
        g.drawString("-- Albert Einstein", 130, 100);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Einstein());
        frame.setSize(340, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
