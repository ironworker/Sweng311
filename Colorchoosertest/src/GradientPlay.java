import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GradientPlay extends JFrame{

      /**
      * @param args
      */
      
      public GradientPlay(){
            setSize(500,500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
      }
      
      public void paint(Graphics g){
            makeGradientBackground(g);
      }
      
      private void makeGradientBackground(Graphics g){
            GradientPaint gp = new GradientPaint(0,0,Color.RED, 500, 500, Color.BLUE);
            Graphics2D g2d = (Graphics2D)g;
            g2d.setPaint(gp);
            g2d.fillRect(0, 0, 500, 500);
      }
      
      
     

}
