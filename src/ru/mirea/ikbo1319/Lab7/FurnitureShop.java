package Lab7;
import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private ArrayList<Furniture>furniture;
    private String[] categories;
    Scanner scanner = new Scanner(System.in);

    public FurnitureShop(){
        furniture = new ArrayList<Furniture>();

    }



    public void setFurniture(int n){
        for(int i = 0; i < n; i += 3){
            furniture.add(i, new Sofa(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(),scanner.nextLine(), scanner.nextDouble()));
            furniture.add(i+1, new Wardrobe(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(),scanner.nextLine()));
            furniture.add(i+2, new Armchair(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(),scanner.nextLine(), scanner.nextDouble()));
        }
    }
}