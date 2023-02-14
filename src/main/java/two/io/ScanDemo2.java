package two.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanDemo2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("in.txt"))
        ){
            while (scanner.hasNext()){
                scanner.useLocale(Locale.US);
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
