package Lesson11;



public class UserBeanImp implements UserBean
{
    private  Users users[] ;

    UserBeanImp(){}
    UserBeanImp(Users users[]){
        this.users=users;
    }

    @Override
    public void getAllUsers(){
       for (int i = 0;i<users.length; i++){
           System.out.println(users[i].getData());
       }
    }
    @Override
    public void getUsersByName(String name){
        for(int i=0; i<users.length;i++){
            if(users[i].getName().equals(name)){
                System.out.println(users[i].getData());
            }
        }
    }

    @Override
    public void getUsersBySurname(String surname) {
        for(int i=0;i<users.length;i++){
           if(users[i].getSurname().equals(surname)){
               System.out.println(users[i].getData());
           }
        }

    }
}
