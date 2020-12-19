package Lab26;

import java.util.*;

public class Main {
    public static void removeDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> e : copy.entrySet()) {
            for (Map.Entry<String, String> e1 : copy.entrySet()) {
                if (e.getValue().equals(e1.getValue()) && !e.getKey().equals(e1.getKey()))
                    map.values().remove(e.getValue());
            }
        }
    }

    public static void addValue(Map<String, ArrayList<String>> map, City city){
        map.computeIfAbsent(city.getCountry(), k -> new ArrayList<>());
        map.get(city.getCountry()).add(city.getCity());
    }

    public static void main(String[] args) {
        // 1
        HashMap<String, String> map = new HashMap<>();
        map.put("Малютина", "Виталия");
        map.put("Меригольд", "Трисс");
        map.put("Из Венгерберга", "Йеннифэр");
        map.put("Из Ривии", "Геральт");
        map.put("Фиона Элен Рианнон ", "Цирилла");
        map.put("Морган", "Артур");
        map.put("Дрейк", "Нейтан");
        map.put("Ван дер Линде", "Датч");
        map.put("Адлер", "Сэди");
        map.put("Анджело", "Томми");
        removeDuplicates(map);
        System.out.println(map);

        // 2
        Map<String, ArrayList<String>> countries = new HashMap<>();
        ArrayList<City> cities = new ArrayList<>(Arrays.asList(
                new City("Валентайн", "Red Dead Redemption II"),
                new City("Аннесбург", "Red Dead Redemption II"),
                new City("Сент-Денис", "Red Dead Redemption II"),
                new City("Новиград", "Хорватия"),
                new City("Лос-Анджелес", "США"),
                new City("Москва", "Россия"),
                new City("Glimmer", "Spyro World")));

        for (City c: cities){
            addValue(countries, c);
        }
        System.out.println(countries);
    }
}
