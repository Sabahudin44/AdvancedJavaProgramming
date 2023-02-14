package three.homework;

import org.example.one.IntegerArray;
import org.example.one.Person;

/**
 * Imamo klasu koja se zove DynamicArray i koja implementira Iterable<Integer>
 *     <>Iterator() --> Iterator<Integer>
 *
 *         <li>1. enhanced for loop ->Iterable >Integer< </li>
 *         <li>2. Iterable me natjera da definiram Iterator</li>
 *
 *
 */

public class HomeworkDemo {
    public static void main(String[] args) {
        int[] numbers = new int[3]; // ova petlja ogranicena samo na tri broja
        for (int number : numbers ){

        }
     //IntegerArray-> Iterable>Integer<
        IntegerArray numberArray = new IntegerArray();
        numberArray.add(23);     //mogu dodavati sa opcijom add koliko hocu u dynamicarrays,a person nije iterable,to je int
        numberArray.add(24);
        numberArray.add(29);
        numberArray.removeAT(2);
        numberArray.add(120); //prednost ovog niza je sto mogu imati koliko hocu brojeva
        numberArray.remove(24);
        for (Integer number : numberArray){
            System.out.println(number);
        }
    }
}
