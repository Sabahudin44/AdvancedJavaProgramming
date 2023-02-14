package org.example.one;

import java.util.Arrays;
import java.util.Iterator;


/**
Da bi radio DynamicArray dynamicArray = new DynamicArray();
 i
 for (int number : dynamicArray){
}
 Moramo da imamo
       implements Iterable<Integer>
       Iterator iterator()

 */

public class IntegerArray implements Iterable<Integer> {

    private int capacity = 0;
    private int[] numbers = new int[capacity];


    public IntegerArray(){
        super();
    }

    public void add (int number){
        capacity++;
        numbers = Arrays.copyOf(numbers, capacity);
        numbers[capacity-1] = number;
    }

    public void removeAT(int index){
        if(index < 0 || index >= capacity ){
        System.err.println("Index out of range,nije ti u redu znaci..");
    }else {
            for (int i = index; i < capacity -1 ;i++ ) {
              numbers[i] = numbers[i+1];
            }
            Arrays.copyOfRange(numbers,0,capacity-1);
            capacity--;
        }

    }

    public void remove(int number){
        for (int i = 0; i < numbers.length; i++ ){
            if (numbers[i] == number){
                removeAT(i);
                break;
            }
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = new IntegerIterator();
        return iterator;
    }

    private class IntegerIterator implements Iterator<Integer>{
        private int nextIndex = 0;
        @Override
        public boolean hasNext() {
            boolean imaJos = (nextIndex <= capacity-1);
            return imaJos;
        }

        @Override
        public Integer next() {
            int number = numbers[nextIndex];
            nextIndex++;   // isprintao samo dva
            return number;
        }    //<-- definicija druge klase unutar sebe unutar ove klase, inner klasa

    }
}
