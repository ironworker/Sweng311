
import java.awt.Graphics;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 401
 */
public class MyBorder extends JPanel {
    
    public void paint(Graphics g){
        //decided to have fun with the border. 
        
        super.paint(g);
        for(int i = 5; i < this.getWidth()-10; i=i+5)
        {
            g.drawOval(+i,5,5,5); //top
             g.drawOval(+i,this.getHeight()-10,5,5); //bottom
        }
        for(int i = 5; i < this.getHeight()-10; i=i+5)
        {
            g.drawOval(5,i,5,5); //right
             g.drawOval(this.getWidth()-10,i,5,5); //left
        }
        //g.drawL
    }
}
