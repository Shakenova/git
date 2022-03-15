package C2L5T1;


import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {
    private String name;
    private String surname;
    private ArrayList<Subject> subjects = new ArrayList<>();


    Student(){}
    Student(String name, String surname, ArrayList<Subject> subjects){
        this.name=name;
        this.surname=surname;
        this.subjects=subjects;
    }

    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setSurname(String surname){this.surname=surname;}
    public String getSurname(){return surname;}

    public void  setSubjects(ArrayList<Subject> subjects){this.subjects=subjects;}
    public ArrayList<Subject> getSubjects(){return subjects;}

    public String getSubjectsList(){
        String s="";
        for(int i=0; i<subjects.size();i++){
            s = s + subjects.get(i).toString()+";";
        }
        return  s;
    }

    @Override
    public String toString(){
        return "Name: "+name+"; Surname: "+surname+"; Subjects List: "+getSubjectsList();
    }


}
