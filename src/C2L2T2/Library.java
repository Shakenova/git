package C2L2T2;

public class Library {
    String name;
    String city;
    Book books[] = new Book[20];
    int index = 0;

    Library(){}
    Library(String name, String  city){
        this.name=name;
        this.city=city;
    }

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setCity(String city){this.city=city;}
    public String getCity(){return city;}

    public void addBook(Book book){
        try {
            books[index] = book;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The library is full");
        }
        index++;
    }

    public void printBooks(){
        for (int i=0; i<books.length; i++){
            Book b=new Book();
            try{
                b=books[i];
            }catch (NullPointerException n){
                System.out.println("The book is empty");
            }
            System.out.println("name:"+getName()+"; city:"+getCity()+"; books:"+books[i].getData()+";");
        }
    }
}
