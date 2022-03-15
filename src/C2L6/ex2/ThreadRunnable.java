package C2L6.ex2;

public class ThreadRunnable implements Runnable{
    String name;
    public ThreadRunnable(String name){
        this.name=name;
    }
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println("Thread "+name+":"+i);
                Thread.sleep(500);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
