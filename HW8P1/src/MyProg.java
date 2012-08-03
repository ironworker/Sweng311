<<<<<<< HEAD
import java.io.*;
public class MyProg {
public static void main(String[] args) throws Exception {
File f = new File("myFile.bin");
        try (FileOutputStream fos = new FileOutputStream(f); DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(100);
            dos.writeDouble(123.55);
            dos.writeUTF("Hello");
        }
FileInputStream fis = new FileInputStream(f);
DataInputStream dis = new DataInputStream(fis);
System.out.println(dis.readInt());
System.out.println(dis.readDouble());
System.out.println(dis.readUTF());
}
}
=======
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matthew_Swenson
 */
public class MyProg extends Utility {
    public static void main( String args[] )
   {
  System.out.println(showData("public static void main( String args[] )"));
   
   
   }
}
>>>>>>> 2e168cc292326a8e46f5af0eab6002f8e043b1ea
