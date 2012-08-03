
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
public class Auto {
    Auto(){
        
    }
    Graphics pg;
    Graphics2D pf;
    int ox, oy, nx, ny;
    void draw(Graphics g,Graphics2D f, int x1, int y1, int x2, int y2){
        ox = x1;
        oy = y1;
        nx = x2;
        ny = y2;
        pg = g;
        pf = f;
        g.drawRect(x1,y1, x2-x1, y2-y1);
    }
    void move(){
        ox+=1;
   
        nx+=1;
 
        draw(pg,pf,ox,oy,nx,ny);
    }
         void drawWheel(int x, int y){
        //Graphics2D pg2 = (Graphics2D)pf;
        AffineTransform at = new AffineTransform();
        at.translate(ox+x,y );
        at.rotate(ox*Math.PI/180);
        pf.setTransform(at);
        pf.drawLine(0,0,8,8);
        pf.drawLine(0,0,-8,8);
        pf.drawLine(0,0,-8,-8);
        pf.drawLine(0,0,8,-8);
        pf.drawOval(-9,-9,18,18);
        }

}
