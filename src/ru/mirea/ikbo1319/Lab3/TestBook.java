package Lab3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("The witcher:last wish", "Andrzej Sapkowski", 1993);
        System.out.println(book);
        book.setAuthor("not Andrzej Sapkowski");
        book.setName("not The witcher:last wish");
        book.setYear(2001);
        System.out.println(book);
    }
}
