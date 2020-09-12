package Lab2;

import Lab2.Dog;
import Lab2.DogKennel;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int age;
        String name;

        Scanner scan = new Scanner(System.in);
        DogKennel dog = new DogKennel();
        name = scan.nextLine();


        while (!(name. equals ( " exit " ))) {
            age = scan.nextInt();
            Dog dogs = new Dog(name, age);
            System.out.println(dogs.ageDog(age));
            System.out.println(dogs.toString());

            dog.dogAdd(name, age);
            name = scan.nextLine();
        }
        dog.show();
    }

}
