package C2L6.ex3;

public class DemoThread implements Runnable{
    protected String name;
    protected Thread t;

    public DemoThread(String name){
        this.name=name;
        t = new Thread(this.name);
        System.out.println("We created new thread: "+t);
        t.start();
    }

    @Override
    public void run(){
        try{
            for(int i=0; i<5;i++){
                System.out.println("Thread "+name+" : "+i);
                Thread.sleep(500);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread "+name+" ended");
    }
}
