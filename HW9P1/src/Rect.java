
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 401
 */
public class Rect extends Shape{
    Graphics g;
    int x1,y1,x2,y2,c1,c2,c3;
    void Rect(){

    }

    @Override
    void draw(Graphics gp, int x, int y, int x_2, int y_2,int a, int b, int c){
        g=gp;
        x1=x;
        y1=y;
        x2=x_2;
        y2=y_2;
        c1=a;
        c2=b;
        c3=c;
        g.setColor(new Color( c1,  c2,  c3));
        g.drawRect(x1,y1,x2-x1,y2-y1);
         g.drawRect(x1,y2,x2-x1,y1-y2);
         g.drawRect(x2,y1,x1-x2,y2-y1);
         g.drawRect(x2,y2,x1-x2,y1-y2);
    }
    @Override
    void draw(){
        g.setColor(new Color( c1,  c2,  c3));
        g.drawRect(x1,y1,x2-x1,y2-y1);
         g.drawRect(x1,y2,x2-x1,y1-y2);
         g.drawRect(x2,y1,x1-x2,y2-y1);
         g.drawRect(x2,y2,x1-x2,y1-y2);
    }
}
