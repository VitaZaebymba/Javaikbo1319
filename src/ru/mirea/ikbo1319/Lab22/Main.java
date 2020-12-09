package Lab22;

import java.io.EOFException;
import java.util.Scanner;

public class Main {
    private int INN;
    private String name;
    public Main(){}
    public Main(int INN,String name){
        this.INN=INN;
        this.name = name;
    }

    public int getINN() {
        return INN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }

    public static void main(String[] args)  {
        String name;
        int INN =12;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Main []test22 = new Main[3];

        test22[0]= new Main(2200,"A");
        test22[1]= new Main(2211,"H");
        test22[2] = new Main(2222,"C");
        System.out.println("Введите ваш ИНН и фамилию");
        INN= scanner.nextInt();
        name = scanner1.nextLine();

        for (int i = 0; i < 3; i++) {
            if(name.equals(test22[i].getName()) && INN == test22[i].getINN()){
                System.out.println("Совпадение в базе данных было найдено");
                break;
            }
            if(i==2){

                throw new NullPointerException("Совпадение в базе данных было не найдено.Будет вызвано исключение");
            }
        }

    }
}
