
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 401
 */
public class Truck extends Auto{
    Truck(){
        
    }
        @Override
    void draw(Graphics g,Graphics2D f, int x1, int y1, int x2, int y2){
        ox = x1;
        oy = y1;
        nx = x2;
        ny = y2;
        pg = g;
        pf = f;
        g.drawRect(ox+50,25, 150, 50);
        g.drawRect(ox+205,40,60,35);
        g.drawOval(ox+60,75,25,25);
        g.drawOval(ox+90,75,25,25);
        g.drawOval(ox+150,75,25,25);
        g.drawOval(ox+180,75,25,25);
        g.drawOval(ox+230,75,25,25);
        drawWheel(74,86);
        drawWheel(104,86);
        drawWheel(164,86);
        drawWheel(194,86);
        drawWheel(244,86);
        
                
    }
}
