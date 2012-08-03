
import java.awt.BasicStroke;
import java.awt.Color;
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
public class Shape {
    Graphics g;
    Graphics2D g2D;
   float number[] = {10,10,10};
    int x1,y1,x2,y2,c1,c2,c3, da,str;
    BasicStroke bs ;
    void draw(Graphics gp, int x, int y, int x_2, int y_2,int a, int b, int c,int dash, int stroke){

        g=gp;
        x1=x;
        y1=y;
        x2=x_2;
        y2=y_2;
        c1=a;
        c2=b;
        c3=c;
        da = dash;
        str = stroke;
                
        g2D =  (Graphics2D) g;
        if(da==1)
         bs = new BasicStroke(str,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,10,number ,10);
        else
             bs = new BasicStroke(str);
        g2D.setStroke(bs);
        g2D.setColor(new Color( c1,  c2,  c3));
        g2D.drawLine(x1,y1,x2,y2);
    }
    void draw(){

        g.setColor(new Color( c1,  c2,  c3));
        g.drawLine(x1,y1,x2,y2);
        
    }

}
