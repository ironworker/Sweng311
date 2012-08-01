/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

/**
 *
 * @author Matthew_Swenson
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp = 0;
        for ( int i = 2; i <= 2000000; i++) {
            boolean t = prime(i);
            if (t)
                temp += (i);
        }
            System.out.println(temp);
        
    }

    
        public static boolean prime(int i){
        int temp = (int)(((double)i / 10) - i/10)*10;
        if (i ==2 || i == 5);
        else
            if ((temp == 2)&&(temp == 4)&&(temp == 6)&&(temp == 8)&&(temp == 0)&&(temp == 5))
                 return false;
        for(int k = 2; k<Math.sqrt(i);k++)
            if (i%k==0)
                return false;
        
        return true;
    
    }
}
