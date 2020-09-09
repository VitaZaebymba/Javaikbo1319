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


        int[] array =new int[10]; //задание 6
        /*for(int i=0; i < array.length; i++)
        {
            array[i]=new Random().nextInt(99);
        }
        for (int i=0; i<array.length;i++) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();*/
        for(int i=0; i < array.length; i++)
        {
            double n =Math.random() *100;
            array[i] =(int) n;
        }
        for (int i=0; i<array.length;i++) {
            System.out.print(" "+ array[i]);
        }
        System.out.println();
        for (int i = array.length-1; i>0 ; i--)
            for(int j=0; j < i; j++)
            {
                if(array[j] >array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        for (int i=0; i<array.length;i++) {
            System.out.print(" "+ array[i]);
        }

       // System.out.println(Fact(5)); //задание 7
    }
    /*static int Fact(int a){
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        return result;
    }*/
}


