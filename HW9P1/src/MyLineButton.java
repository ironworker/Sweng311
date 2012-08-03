
import java.awt.Graphics;
import javax.swing.JButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 401
 */
public class MyLineButton extends JButton{
    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(3,3,this.getWidth()-6,this.getHeight()-6);
        //g.drawL
    }

    
}
