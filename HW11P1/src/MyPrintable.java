
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 401
 */
public class MyPrintable implements Printable{
    Image im;
    public MyPrintable(Image im){
        this.im = im;
    }
    @Override
    public int print(Graphics grphcs, PageFormat pf, int i) throws PrinterException {
        grphcs.drawImage(im,0,0,null);
        return PAGE_EXISTS;
    }
    
}
