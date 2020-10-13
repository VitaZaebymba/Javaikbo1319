package Lab10;

import java.util.Scanner;

public class Numbers {
    private Scanner scanner = new Scanner(System.in);

    public void Numbers_1(){
        int scount = 0;
        int krazr = scanner.nextInt();
        int sum = scanner.nextInt();
        int index = (int) Math.pow(10.0, krazr-1);
        while (index < Math.pow(10, krazr)){
            int ssum = 0;
            int num = index;

            while (num != 0){
                ssum += num%10;
                num /= 10;
            }
            if(ssum == sum){
                System.out.println(index + " ");
                scount++;
            }
            index++;
        }
        System.out.println(scount);
    }


    public void Numbers_2(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Numbers_2_1(a,b);
    }
    public int Numbers_2_1(int a, int b){
        if (a > b+1){
            return 0;
        }
        if (a==0 || b==0) {
            return 1;
        }
        return (Numbers_2_1(a,b-1) + Numbers_2_1(a-1,b-1));
    }

    public void Numbers_3(){
        int N = scanner.nextInt();
        Numbers_3_1(N);
    }

    public int Numbers_3_1(int a){
        System.out.print(a % 10);
        if(a / 10 != 0)
            return Numbers_3_1(a / 10);
        return 0;
    }

    Numbers(){
        Numbers_1();
        Numbers_2();
        Numbers_3();
    }

    public static void main(String[] args){
        new Numbers();
    }
}
