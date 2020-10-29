package Lab16;

import java.util.ArrayList;
import java.util.Scanner;

public class Drunkard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        int mas[] = new int[5];
        int count=0;

        for (int i=0;i<5;i++) {
            mas[i] = sc.nextInt();
            player1.add(mas[i]);
        }

        for (int i=0;i<5;i++) {
            mas[i] = sc.nextInt();
            player2.add(mas[i]);
        }

        while (player1.size()>0 && player2.size()>0 && count!=106){
            count++;
            if ((player1.get(0) > player2.get(0) && player1.get(0) != 9 && player2.get(0) != 0) || (player1.get(0) == 0 && player2.get(0) == 9)){
                player1.add(player1.get(0));
                player1.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            }
            else if ((player1.get(0) < player2.get(0) && player1.get(0) != 0 && player2.get(0) != 9) || (player1.get(0) == 9 && player2.get(0) == 0)){
                player2.add(player1.get(0));
                player2.add(player2.get(0));
                player1.remove(0);
                player2.remove(0);
            }
        }

        if (count ==106) System.out.println("botva");
        else if (player1.size()==0) {
            System.out.println("second " + count);
        }
        else if (player2.size() == 0){
            System.out.println("first "+ count);
        }

    }
}