package C2L6T3;

public class Car implements Runnable{
    protected String name;
    private int speed;
    private double distance;
  //  private ArrayList<Car> list = new ArrayList<>();
    private double time;
    protected Thread t;

    public Car (String name, int speed, double distance){
        this.name=name;
        this.speed=speed;
        this.distance=distance;
        t = new Thread(this,name);
        //System.out.println("We created new thread: "+t);
        t.start();

    }
    @Override
    public void run(){
        //time=0;
        try{

            for(int i=1; i<distance; i++) {
                if (i * speed <= distance) {
                    System.out.println(name + " " + i+ " is in " + i*speed + " meters");
                    Thread.sleep(500);
                }else{
                    //time = i-1;
                    time =distance/(double) speed;
                    break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread "+name+" ended in "+time+" second");
    }

    public double getTime(){
        return time;
    }

}
