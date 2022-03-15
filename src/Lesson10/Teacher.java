package Lesson10;

public class Teacher extends User{
    String nickName;
    String status;
    String subjects[]=new String[10];
    int sizeOfSubjects = 0;

    Teacher(){}
    Teacher(int id, String login, String password, String nickName, String status, int sizeOfSubjects){
        super(id, login, password);
        this.nickName=nickName;
        this.status=status;
        this.sizeOfSubjects=sizeOfSubjects;
    }
    public void setNickName(String nickName){this.nickName=nickName;}
    public String getNickName(){return nickName;}
    public void setStatus(String status){this.status=status;}
    public String getStatus(){return status;}
    public int getSizeOfSubjects(){return sizeOfSubjects;}
    public void addSubjects(String subject){
        this.subjects[getSizeOfSubjects()] = subject;
        sizeOfSubjects++;
    }
    public String getSubjects(){
        String s = new String("");
        for(int i=0; i<getSizeOfSubjects();i++){
            s+= subjects[i]+"; ";
        }
        return s;
    }
    @Override
    public String getUserData(){
        return "Id is: "+getId()+"; Login is: "+getLogin()+"; Password is: "+getPassword()+"; NickName is:"+getNickName()+
    "; Status is: "+getStatus()+"; Subjects list: "+getSubjects();
    }
}
