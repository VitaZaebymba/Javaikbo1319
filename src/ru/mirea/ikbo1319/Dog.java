package Lab2;

import java.lang.String;

public class Dog {
    private int age;
    private String name;

    public Dog(String name, int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int ageDog (int age) {
        return this.age = age * 7;
    }
    public String toString(){
        return this.name + " " + getAge();

    }
}
