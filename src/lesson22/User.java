package lesson22;

public class User {
    String name;
    String surname;
    int age;

    User(){}
    User(String name, String surname, int age){
        this.name=name;
        this.surname=surname;
        this.age=age;

    }
    public void getUserData(){
        System.out.println(name+", "+surname+", "+age);
    }

}
