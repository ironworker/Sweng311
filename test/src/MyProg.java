/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew_Swenson
 */
import java.lang.Math;    // program uses class Math
//docs.oracle.com/javase/7/docs/api/
import java.util.Scanner; // program uses class Scanner
public class MyProg 
{
   /**
      main method that begins execution of Java application
   */
   public static void main( String args[] )
   {
   /*
      Scanner object that grabs inputs from the command window
   */
   Scanner input = new Scanner( System.in );
   System.out.print( "Enter name: " );       // prompt
   String n = input.next(); // read name from user
   System.out.print( "Enter age: " );     // prompt
   double a = input.nextDouble(); // read first amount from user
   System.out.print( "Enter company name: " );      // prompt
   String c = input.next(); // read second amount from user
   Person p = new Person(n, c, a);
   p.showSalary( );
   p.showData( );
   } // end method main
} // end class MyProg
 
