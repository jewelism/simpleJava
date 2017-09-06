package advJava3_2.awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class G2_ex3b{

    static class MyView extends JPanel {

        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            Graphics2D g = (Graphics2D)graphics;
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            float x = 50, y = 150;
            String text = "�ȳ� Java 2D �׷���";
            Font font = new Font("�ü�ü", Font.BOLD, 60);
            g.setFont(font);
            g.setColor(Color.LIGHT_GRAY);
            g.drawString(text,  x + 2f,  y + 2f);
            g.setColor(Color.BLUE);
            g.drawString(text,  x,  y);
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
