package C2L8T1;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String operationType;
    private ArrayList<Book> books;
    private Book book;

    public PackageData(){}
    public PackageData(String operationType, ArrayList<Book> books, Book book){
        this.operationType=operationType;
        this.books=books;
        this.book=book;
    }

    public void setOperationType(String operationType){this.operationType=operationType;}
    public String getOperationType(){return operationType;}

    public void setBooks(ArrayList<Book> books){ this.books=books;}
    public ArrayList<Book> getBooks(){return books;}

    public void setBook(Book book){this.book=book;}
    public Book getBook(){return book;}

    public void addBook(Book book){
        books.add(book);
    }

//    public String getBookList(books){
//        for(int i=0; i<books.)
//        return books;
//    }



}
