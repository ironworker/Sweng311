
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
public class MyOvalButton extends JButton{
    public void paint(Graphics g){
        super.paint(g);
        g.drawOval(5,5,this.getWidth()-12,this.getHeight()-12);
    }
}
