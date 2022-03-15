package C2L6.ex1;

public class ThreadSample extends Thread{
    String name;

    public ThreadSample(String name){
        this.name=name;
    }

    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println("Thread "+name+" : "+i);
                Thread.sleep(500);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
