
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
public class RRect extends Shape{
    void RRect(){

    }

    @Override
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
        g.setColor(new Color( c1,  c2,  c3));
        g.drawRoundRect(x1,y1,x2-x1,y2-y1,40,40);
         g.drawRoundRect(x1,y2,x2-x1,y1-y2,40,40);
         g.drawRoundRect(x2,y1,x1-x2,y2-y1,40,40);
         g.drawRoundRect(x2,y2,x1-x2,y1-y2,40,40);
         

    }
    @Override
    void draw(){
         g.setColor(new Color( c1,  c2,  c3));
        g.drawRoundRect(x1,y1,x2-x1,y2-y1,40,40);
         g.drawRoundRect(x1,y2,x2-x1,y1-y2,40,40);
         g.drawRoundRect(x2,y1,x1-x2,y2-y1,40,40);
         g.drawRoundRect(x2,y2,x1-x2,y1-y2,40,40);       
    }
}
