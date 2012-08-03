<<<<<<< HEAD

=======
>>>>>>> 2e168cc292326a8e46f5af0eab6002f8e043b1ea
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
<<<<<<< HEAD
 * 
 * @author 401
 */
//import java.lang.reflect;
public class MyUtility extends Utility {
    Utility text = new Utility();
    String a = text.showData("Data.txt");
    //"This is    a     book."
    public void getLine(){
        String[] b = a.split("\\s+");//special escape thing to split without space

        //int j = 1;
        for(int i=0;i<b.length;i++)
        {

            //if(!b[i].contains(" ")){
                System.out.print(i+1);
                System.out.print(": ");
                //j++;
                System.out.println(b[i]);
            //}
        }
    }
    
=======
 *
 * @author Matthew_Swenson
 */
public class MyUtility extends Utility{
    //@Override
    String a;
    a = "public static void main( String args[] )";
>>>>>>> 2e168cc292326a8e46f5af0eab6002f8e043b1ea
}
