package Lesson10;

public abstract class User {
    int id;
    String login;
    String password;

    User(){}
    User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    abstract String getUserData();

    public void setId( int id){this.id = id;}
    public int getId(){return id;}

    public void setLogin(String login){this.login=login;}
    public String getLogin(){return login;}

    public void setPassword(String password){this.password=password;}
    public String getPassword(){return password;}


}
