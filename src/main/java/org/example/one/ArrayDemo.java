package org.example.one;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 123;
        /*  C++
        for (int i = 0; i< numbers.length; i++){
            int number = numbers[1];
            System.out.println(number);
        }
         */
        //numbers[3] = 120;
        //Java Enhanced For Loop
        for (int number : numbers){
            System.out.println(number);
        }
        // dynaminArray = tipa DynamicArray, Iterable<Integer>
        System.out.println("Dinamički");
        IntegerArray dynamicArray = new IntegerArray();
        dynamicArray.add(23);
        dynamicArray.add(24);
        dynamicArray.add(123);
        dynamicArray.add(120);
        for (int number : dynamicArray){
            System.out.println(number);
        }

        IntegerArray dynamicArray2 = new IntegerArray();
        dynamicArray2.add(1000);
        dynamicArray2.add(2000);
        for (int number : dynamicArray2){
            System.out.println((number));
        }



    }
}
