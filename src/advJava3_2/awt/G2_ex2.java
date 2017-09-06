package advJava3_2.awt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RadialGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class G2_ex2 {
    
    static class MyView extends JPanel {
        
        @Override
        public void paint(Graphics graphics) {
            super.paint(graphics);
            Graphics2D g = (Graphics2D)graphics;
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            float x1 = 50, x2 = 150, width = 100;
            float y1 = 50, y2 = 150, height = 100;
            
            Rectangle2D.Float rect = new Rectangle2D.Float(x1, y1, width, height);
            float centerX = (x1 + x2) / 2;
            float centerY = (y1 + y2) / 2;
            float radius = (float)Math.sqrt( width * width + height * height) / 2;
            float[] fractions = { 0f, 1f };
            Color[] colors = { Color.WHITE, Color.BLUE };
            g.setPaint(new RadialGradientPaint(centerX, centerY, radius, fractions, colors));
            g.fill(rect);
            
            x1 = 200; x2 = x1 + width;
            rect = new Rectangle2D.Float(x1, y1, width, height);
            centerX = (x1 + x2) / 2 - radius * 0.3f;
            centerY = (y1 + y2) / 2 - radius * 0.3f;
            colors = new Color[] { Color.WHITE, Color.YELLOW.darker() };
            g.setPaint(new RadialGradientPaint(centerX, centerY, radius, fractions, colors));
            g.fill(rect);
            
            x1 = 350; x2 = x1 + width;
            Ellipse2D.Float ellipse = new Ellipse2D.Float(x1, y1, width, height);
            centerX = (x1 + x2) / 2;
            centerY = (y1 + y2) / 2;
            radius = 50f;
            colors = new Color[] { Color.WHITE, Color.GREEN.darker() };
            g.setPaint(new RadialGradientPaint(centerX, centerY, radius, fractions, colors));
            g.fill(ellipse);
            
            x1 = 500; x2 = x1 + width;
            ellipse = new Ellipse2D.Float(x1, y1, width, height);
            centerX = (x1 + x2) / 2 - radius * 0.3f;
            centerY = (y1 + y2) / 2 - radius * 0.3f;
            colors = new Color[] { Color.WHITE, Color.RED };
            g.setPaint(new RadialGradientPaint(centerX, centerY, radius, fractions, colors));
            g.fill(ellipse);
        }    
    }
    
    public static void main(String[] args) {
        
        MyView myView = new MyView();
        myView.setBackground(Color.WHITE);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 300);
        frame.add(myView);
        frame.setVisible(true);
    } 

}

