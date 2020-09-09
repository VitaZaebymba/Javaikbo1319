package ru.mirea.ikbo1319;

public class DogKennel {
    public static void main(String[] args) {
        Dog d1 = new Dog("Kratos", 15);
        Dog d2 = new Dog("Geralt", 10);
        Dog d3 = new Dog("Arthur", 2);
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}

