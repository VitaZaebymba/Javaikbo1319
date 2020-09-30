package Lab7;

import java.util.ArrayList;


public class Person{
    private ArrayList<FurnitureShop> basket;
    private int index = 0;

    public Person() {
        basket = new ArrayList<FurnitureShop>();
    }

    public void addBasket(FurnitureShop element){
        basket.add(index, element);
        index += 1;
    }
}
