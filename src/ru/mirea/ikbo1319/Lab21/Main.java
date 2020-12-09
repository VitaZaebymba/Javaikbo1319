package Lab21;

import java.util.Scanner;

public class Main {
    public static class Exception2 {
        void exceptionDemo_1(){
            try{
                System.out.println(2 / 0);
            } catch (Exception e){
                System.out.println(e.toString());
            }
            System.out.println(2.0 / 0.0); // Inf.
        }
        void exceptionDemo_2() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter an integer ");
            int i = Integer.parseInt(sc.next());
            try {
                System.out.println( 2 / i );
            } catch (Exception e){
                System.out.println("catch" + e.toString());
            } finally {
                System.out.println("finally");
                sc.close();
            }
        }
    }
    public static void main(String[] args){
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo_1();
        exception2.exceptionDemo_2();
    }
}