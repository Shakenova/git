package Lesson9;

public class Staff extends User{
    private double salary;
    private String subjects[] = new String[100];
    private int indexOfSubject = 0;

    Staff(){}
    Staff(int id, String login, String password, String name, String surname, double salary){
        super(id, login, password, name, surname);
        this.salary = salary;
    }
    public void setSalary( double salary){
        this.salary = salary;
    }
    public double getSalary(){return salary;}


    public void setIndexOfSubject(){
        this.indexOfSubject = indexOfSubject;
    }
    public int getIndexOfSubject(){return indexOfSubject;}


    public void addSubjects(String subject){
        this.subjects[indexOfSubject] = subject;
        indexOfSubject++;
    }
    public String getSubjects(){
        String s = new String("");
        for(int i=0; i<indexOfSubject;i++){
            s+= subjects[i]+"; ";
        }
        return s;
    }

    @Override
    public void getData(){
        System.out.println(getId()+" "+getLogin()+" "+getPassword()+" "+getName()+" "+getSurname()+" "+getSalary()+" "+getSubjects()+" "+getIndexOfSubject());
    }
}

