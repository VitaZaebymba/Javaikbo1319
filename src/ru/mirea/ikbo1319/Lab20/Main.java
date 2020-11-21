package Lab20;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        FileReader r_file = new FileReader("/Users/user/Desktop/book1.txt");
        Scanner sc = new Scanner(r_file);

        FileWriter w_file = new FileWriter("/Users/user/Desktop/book2.txt");
        while(sc.hasNextLine()) // замена пробелов и переносов строк на # и запись в отдельный файл war_and_peace_fixed.txt
            w_file.write(sc.nextLine().replace(' ', '#').replace("\u00a0", " ") + "#");
        w_file.close();

        r_file = new FileReader("/Users/user/Desktop/book2.txt");
        List<String> massive = new ArrayList<>(Arrays.asList((new Scanner(r_file)).nextLine().split("[^A-Za-zА-Яа-я]")));
        r_file.close();
        massive.removeIf(j -> (j.equals("")));
        Collections.sort(massive); // сортируем массив, чтобы одинаковые слова шли друг за другом
        String max_word = "", word = "";
        int max_count = 0, count = 1;
        for(String str : massive){
            if(str.equals(word))
                count++;
            else{
                if(count > max_count){
                    max_count = count;
                    max_word = word;
                }
                word = str;
                count = 1;
            }
        }
        if(count > max_count){
            max_count = count;
            max_word = word;
        }
        System.out.print("Самое повторяющееся слово: " + max_word + " (встречается " + max_count + " раз)");
    }
}