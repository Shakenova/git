package C2L9.ex1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DBManager db = new DBManager();
        db.connect();
    }
}
