//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new  Author("Name", "Petrov", 500);
        Book book = new Book("Название книги", 2025, author, 1);

        System.out.println(book.isBig());
        System.out.println(book.matches("Name"));
        System.out.println(book.matches("книги"));
        System.out.println(book.matches("Petr"));
        System.out.println(book.estimatePrice());



    }
}