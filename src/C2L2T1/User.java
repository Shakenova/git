package C2L2T1;


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

