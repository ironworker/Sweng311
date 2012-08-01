/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler3;

import java.math.BigInteger;

/**
 *
 * @author Matthew_Swenson
 */
public class Euler3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int times = 0;
         int  number = 2;
        while (times <=10001){
            while (!isPrime(number))
                number++;
            number++;
            times++;
        }
        System.out.println(number-1);
    }
    public static boolean isPrime(int i){
                for (int k = 2; k < i/2; k++){
                    if (i%k==0)
                        return false;
                }
                
                return true;
            }
    public static int factor(int i){
        int j = 2;
        while (i%j!=0 ){
            j++;
        }
        return i/j;
    }
}
