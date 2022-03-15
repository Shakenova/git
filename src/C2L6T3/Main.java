package C2L6T3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        double distance = 500;
        Car c1 = new Car("Ferrari",100, distance);
        Car c2 = new Car("Toyota", 60, distance);
        Car c3 = new Car("Mercedes", 80, distance);
        Car c4 = new Car("Honda", 40, distance);
        Car c5 = new Car("Mazda", 50, distance);
        Car c6 = new Car("Audi", 70, distance);
        Car c7 = new Car("Kia", 20, distance);
        Car c8 = new Car("Lada", 10, distance);
        Car c9 = new Car("Hyundai", 30,  distance);
        Car c10 = new Car("BMW", 90, distance);

        try{
            System.out.println("Waiting all threads");
            c1.t.join();
            c2.t.join();
            c3.t.join();
            c4.t.join();
            c5.t.join();
            c6.t.join();
            c7.t.join();
            c8.t.join();
            c9.t.join();
            c10.t.join();


        }catch (Exception e){
            System.out.println("Thread interrupted");
        }

        System.out.println("Thread "+c1.name+" is alive: "+c1.t.isAlive());
        System.out.println("Thread "+c2.name+" is alive: "+c2.t.isAlive());
        System.out.println("Thread "+c3.name+" is alive: "+c3.t.isAlive());
        System.out.println("Thread "+c4.name+" is alive: "+c4.t.isAlive());
        System.out.println("Thread "+c5.name+" is alive: "+c5.t.isAlive());
        System.out.println("Thread "+c6.name+" is alive: "+c6.t.isAlive());
        System.out.println("Thread "+c7.name+" is alive: "+c7.t.isAlive());
        System.out.println("Thread "+c8.name+" is alive: "+c8.t.isAlive());
        System.out.println("Thread "+c9.name+" is alive: "+c9.t.isAlive());
        System.out.println("Thread "+c10.name+" is alive: "+c10.t.isAlive());
        System.out.println("Main thread is ended");


        System.out.println("FINAL RESULTS:");

      ArrayList<Car> list = new ArrayList<>();
       list.add(c1);
       list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
        list.add(c8);
        list.add(c9);
        list.add(c10);

        boolean flag = false;
        Car tmp;

        while (!flag) {
            flag = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i).getTime() > list.get(i + 1).getTime()) {
                    flag = false;
                    tmp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, tmp);

                }
            }
        }
        for (int i =0; i<list.size(); i++){
            int j = i+1;
            System.out.println("Place "+j+": "+list.get(i).name+" - "+list.get(i).getTime()+" seconds");
        }



    }
}
