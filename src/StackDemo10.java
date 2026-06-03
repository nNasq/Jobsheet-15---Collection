import java.util.Stack;

public class StackDemo10 {
    public static void main(String[] args) {
        Book10 book1 = new Book10("1234", "Dasar Pemrograman");
        Book10 book2 = new Book10("7145", "Hafalah Shalat Delisa");
        Book10 book3 = new Book10("3562", "Muhammad Al-Fatih");

        Stack<Book10> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book10 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book10 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        for (Book10 book : books) {
            System.out.println(book.toString());
        }

        System.out.println(books);
    }
}
