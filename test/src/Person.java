/*
 * Person class
 */

/**
 *
 * @author Matthew_Swenson
 */

public class Person
{
   String name, company;
   double age;
   /**
     constructor that takes in three arguments
   */
   public Person(String n, String c, double a){
        /*
            assigning argument values to the fields
        */
        name = n;
        company = c;
        age = a;
   }
 
   /**
     method for displaying the computation result.
   */
   public void showSalary( ) {
   System.out.printf( "\"$Salary:$\" %.2f\n", (40000* Math.sqrt( Math.exp(0.04295 * age + 0.141)))); // display result
   } // end method showSalary
   /**
     method for displaying the person's stored data.
   */
   public void showData( ) {
   System.out.printf( "\\$Name:$\\ = %s,\t\\$Age:$\\ = %3.0f,\t\\$Company Name:$\\ = %s \n", name,age,company); // display result
   } // end method showData
} // end class Person
