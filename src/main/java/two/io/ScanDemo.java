package two.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/**
 * java.io.FileReader
 * java.io.FileWriter
 * <p>
 *     java.io.BufferdReader
 *     java.io.PrintWriter
 * </p>
 */

public class ScanDemo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("in.txt");
                BufferedReader reader = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(reader)
        ){
         while (scanner.hasNext()){
             String line = scanner.nextLine();
             System.out.println(line);
         }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
