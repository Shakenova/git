package C2L2T2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library n = new Library("Library", "Almaty");
        for (int i=0; i<5;i++){
            System.out.println("Add book: id, name, author");
            Book b = new Book();
            b.setId(in.nextInt());
            b.setName(in.next());
            b.setAuthor(in.next());
            n.addBook(b);
        }

    }
}
