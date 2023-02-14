package two.io;

import java.io.*;

/**
 * java.io.FileReader
 * java.io.FileWriter
 * <p>
 *     java.io.BufferdReader
 *     java.io.PrintWriter
 * </p>
 */


public class CopyLInesDemo {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
                PrintWriter out = new PrintWriter(new FileWriter("out4.txt"));
                ) {
            String line = "";

            while ((line = reader.readLine())!=null){
                System.out.println(line);
                out.println(line);
            }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

    }
}
