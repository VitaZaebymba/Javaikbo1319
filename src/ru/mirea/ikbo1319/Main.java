package ru.mirea.ikbo1319;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       //int[] array = {1, 2, 3};
        //int k = 0; //сумма
        /*for (int i = 0; i < array.length - 1; i++) { //задание 3
            k = k + array[i];
        }*/
        /*int i = 0;
        while (i < array.length) {
            k = k + array[i];
            i++;
        }*/
        /*int i = 0;
        do {
            k = k + array[i];
            i++;
        }
        while (i < array.length);
        System.out.println(k);*/



        /*for(int i=0;i<3;i++) {//задание 4
            System.out.print(args[i]);
        }*/


        /*for(int i= 1; i<10; i++){ // задание 5
            System.out.printf(" %.2f", 1.0/i);
        }*/

        System.out.println(Fact(5)); //задание 8
    }
    static int Fact(int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}


