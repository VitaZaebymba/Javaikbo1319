package Lab19;

import java.io.*;
import java.util.Scanner;

public class Main {
    private static final String PATH = "/Users/user/Desktop/TheWitcher.txt";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        File file = new File(PATH);

        try{
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append(scanner.nextLine());
            fileWriter.close();
        } catch (IOException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }

        try{
            System.out.println("Содержание файла: ");
            scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
        } catch (IOException e){
            System.out.println("Error: ");
            e.printStackTrace();
        }
        scanner = new Scanner(System.in);
        try(FileWriter fileWriter = new FileWriter(PATH, true))
        {
            fileWriter.append("\n").append(scanner.nextLine());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
