
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import javax.swing.JButton;

public class OvalButton extends JButton implements InfoIF {
 
  public OvalButton(){
    this.setContentAreaFilled(false);//don&rsquo;t fill entire button
  }
 
  public boolean contains(int x, int y){
    Ellipse2D e2d = new Ellipse2D.Double(0,0,this.getWidth(),this.getHeight());
    if(e2d.contains(x,y)){ //if click outside ellipse dont arm
      return true;
    }else{
      return false;
    }
  }
  public void paintComponent(Graphics g){
    if(this.getModel().isArmed()){ //if armed change color red
      g.setColor(Color.red);
    }else{
      g.setColor(this.getBackground());
    }
    g.fillOval(0,0,this.getWidth()-1,this.getHeight()-1); 
    super.paintComponent(g); //repaint on screen
  }
  public void paintBorder(Graphics g){
    g.setColor(Color.blue);
    g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1); 
  }
 
  public double getArea() {
    // utilize getWidth() and getHeight() to compute size.
    return .8*(double)(this.getWidth()*this.getHeight());
  }
}