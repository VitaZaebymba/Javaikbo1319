package Lab15;

public class CollectionTest{
    int[] arr = new int[] {20, 4, 37, 44, 19};
    int size = 5;

    public void test(){
        Collection col = new Collection(arr, size);
        System.out.println("Тесты:\nДобавление элемента:");
        col.add(9);
        System.out.println("Удаление элемента:");
        col.del();
        System.out.println("Поиск элемента со значением 3:");
        col.elemSearch(3);
        System.out.println("Поиск элемента с индексом 1:");
        col.indSearch(1);
        System.out.println("Поиск минимума:");
        col.searchMin();
        System.out.println("Поиск максимума:");
        col.searchMax();
        System.out.println("Поиск среднего значения:");
        col.searchAverg();
    }
}
