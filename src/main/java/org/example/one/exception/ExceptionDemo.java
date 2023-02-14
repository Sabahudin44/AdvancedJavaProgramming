package org.example.one.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Unesite neki broj...");
        int[] numbers = new int[3];
        int number = new Scanner(System.in).nextInt();
        //UNCHEKED error
        System.out.println(number / 0);
        numbers[33] = number;
        System.out.println("Uneseni broj je " + number);
        //CHEKED exception
        try {
            readFile("sadrzaj.txt");
        }catch (FileNotFoundException e){
            System.err.println(e.getMessage());

        }



    }
        static void readFile(String imeFajla) throws FileNotFoundException{

        }
}
