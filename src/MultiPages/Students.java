package MultiPages;

public class Students {
    private int id;
    private String name;
    private String surname;
    private String faculty;
    private String group;

    Students(){}
    Students(int id, String name, String surname, String faculty, String group){
        this.id=id;
        this.name=name;
        this.surname=surname;
        this.faculty=faculty;
        this.group=group;
    }
    public void setId(int id){this.id=id;}
    public int getId(){return id;}

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setSurname(String surname){this.surname=surname;}
    public String getSurname(){return surname;}

    public void setFaculty(String faculty){this.faculty=faculty;}
    public String getFaculty(){return faculty;}

    public void setGroup(){this.group=group;}
    public String getGroup(){return group;}


}
