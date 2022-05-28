package com.sofkau.practica.numbers.utils;
public class Iterator {
    private static final Iterator ITERATOR = new Iterator();

    private Iterator() {
    }

    public static Iterator getInstance() {
        return ITERATOR;
    }

    public void whileOdd(){
        whileIterator(true);
    }

    public void whileEven(){
        whileIterator(false);
    }

    public void forOdd(){
        forIterator(true);
    }

    public void forEven(){
        forIterator(false);
    }

    private void whileIterator(Boolean flag){
        int iterator = 1;
        while(iterator <= 100){
            printIf(iterator, flag);
            iterator++;
        }
    }

    private void forIterator(Boolean flag){
        for(int iterator =1;iterator <= 100; iterator++){
            printIf(iterator, flag);
        }
    }

    private void printIf(int number, Boolean flag){
        if(flag.equals(number % 2 == 0)){
            Message.print(Integer.toString(number));
        }
    }
}
