
import java.awt.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Matthew_Swenson
 */
//package java.awt.Graphics;
public class MyFrame extends javax.swing.JFrame {
    public MyFrame() {
        initComponents();
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.translate(this.getWidth()/2, this.getHeight()/2);
        double x_gap = (this.getWidth()/2 - 75) /10.0;
        double y_gap = (this.getHeight()/2 - 75) /10.0;
        for(int i = 0; i<10;i++){
            g.drawLine((int)(x_gap*i),0,0,(int)((9-i)*y_gap));
        }
        
        
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
