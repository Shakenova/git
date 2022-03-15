package Lesson10;

public class ERPSystem {
    User memory[] = new User[1000];
    int sizeOfUsers = 0;

    ERPSystem(){}
    ERPSystem(int sizeOfUsers){
        this.sizeOfUsers = sizeOfUsers;
    }
    public void addUser(User u) {
        if (sizeOfUsers < 100) {
            this.memory[sizeOfUsers] = u;
            sizeOfUsers++;
        }
    }

    public void printAllUsers(){
       // String s = new String("");
        for (int i=0;i<sizeOfUsers;i++){
            System.out.println(i+") "+memory[i].getUserData());
        }
    }
    public void printUser(int index){
        if(0<=index && index<=sizeOfUsers ){
            System.out.println(memory[index].getUserData());
        }else{
            System.out.println("No such user in this index");
        }

    }
}
