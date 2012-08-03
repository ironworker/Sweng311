
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 401
 */
public class Wagon extends Auto{
    Wagon(){
        
    }
        @Override
    void draw(Graphics g,Graphics2D f, int x1, int y1, int x2, int y2){

        
         ox = x1;
        oy = y1;
        nx = x2;
        ny = y2;
        pg = g;
        pf = f;
        g.drawRect(ox+50,50, 100, 25);
        g.drawRect(ox+50,25,75,25);
        g.drawOval(ox+60,75,25,25);
        g.drawOval(ox+120,75,25,25);
        drawWheel(74, 86);
        drawWheel(134,86);
        
    }


}
