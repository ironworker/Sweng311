import java.awt.Polygon;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

public class PolBut extends JButton implements InfoIF {
 
  public PolBut(){
    this.setContentAreaFilled(false);//don&rsquo;t fill entire button
  }
 Polygon p2d;
  public boolean contains(int x, int y){
     p2d = new Polygon();
    p2d.addPoint(0,0);
    p2d.addPoint(0,this.getHeight()-2);
    p2d.addPoint(this.getWidth()-2,this.getHeight()-2);
    if(p2d.contains(x,y)){ //if click outside ellipse dont arm
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
    g.fillPolygon(p2d);//(0,0,this.getWidth()-1,this.getHeight()-1); 
    super.paintComponent(g); //repaint on screen
  }
  public void paintBorder(Graphics g){
    g.setColor(Color.blue);
    g.drawPolygon(p2d);//(0, 0, this.getWidth()-1, this.getHeight()-1); 
  }
 
  public double getArea() {
    // utilize getWidth() and getHeight() to compute size.
      
    return (double)(this.getHeight() * this.getWidth())/2;
  }
}