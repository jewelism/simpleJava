package advJava3_2.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.font.TextLayout;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class G2_ex3c {

    static class MyView extends JPanel {

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            Graphics2D g = (Graphics2D)graphics;
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            float x = 50, y = 150;
            String text = "�ȳ� Java 2D �׷���";

            Font font = new Font("�ü�ü", Font.BOLD, 60);
            TextLayout textLayout = new TextLayout(text, font, g.getFontRenderContext());
            Rectangle2D rect = textLayout.getBounds();

            g.setColor(Color.LIGHT_GRAY);
            textLayout.draw(g, x + 5f, y + 5f);

            float x1 = x + (float)rect.getMinX();
            float x2 = x + (float)rect.getMaxX();
            g.setPaint(new GradientPaint(x1, 0, Color.BLUE, x2, 0, Color.GREEN, true));
            textLayout.draw(g, x, y);
        }
    }

    public static void main(String[] args) {

        MyView myView = new MyView();
        myView.setBackground(Color.WHITE);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 300);
        frame.add(myView);
        frame.setVisible(true);
    }

}
