package two.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * sadrzaj fajla mozemo kopirati byte po byte
 * <p>
 *     java.io.FileInputStream
 *     java.io.FileOutputStream
 * </p>
 * <p>
 *   <1.7 --->
 *       try-catch-finnally
 *       1.7 try-with-resources
 *
 * </p>
 */

public class CopyByteDemo {
    public static void main(String[] args) {
        //NasReader nasReader = new NasReader()  //<--- ovo je try with resources
      try(FileInputStream fin = new FileInputStream("in.txt");
          FileOutputStream out = new FileOutputStream("out2.txt")
      ){
          int jedanBajt;
          while ((jedanBajt = fin.read())!=-1){
             char slovo = (char) jedanBajt;
              System.out.print(slovo);
              out.write(jedanBajt);
          }
          System.out.println();
                                       //<--- ovo je try with resources
      }catch (IOException e){
          throw new RuntimeException(e);
      }

    }
}
