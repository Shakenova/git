package C2L8T1;

public class Book {
    private int id=0;
    private String name;
    private String author;


    public Book(){}
    public Book(String name, String author){
        this.author=author;
        this.name=name;
        id++;
    }

    public int getId(){return id;}

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setAuthor(String author){this.author=author;}
    public String getAuthor(){return author;}

    public String toString(){
        return "name: "+name+"; author: "+author;
    }
}
