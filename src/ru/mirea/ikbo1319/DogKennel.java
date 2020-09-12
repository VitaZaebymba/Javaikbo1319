package Lab2;

import Lab2.Dog;

import java.util.*;
import java.lang.String;

public class DogKennel {

    public void dogAdd(String name, int age){
        dogs.add(new Dog(name, age));
    }
    public void show(){
        System.out.println(dogs);
    }

    ArrayList <Dog> dogs = new ArrayList<Dog>();
}
