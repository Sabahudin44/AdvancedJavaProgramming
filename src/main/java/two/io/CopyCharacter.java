package two.io;

/**
 * java.io.FileReader
 * java.io.FileWriter
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacter {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("in.txt");
             FileWriter write = new FileWriter("out3.txt");
        ) {
          int charOfContent;
          while ((charOfContent = reader.read())!= -1){
              System.out.print((char) charOfContent);
              write.write(charOfContent);
          }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
