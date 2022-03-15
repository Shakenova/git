package Lesson11;

import Lesson10.User;

public class Main {
    public static void main(String[] args) {
      Workers workers[]={
              new Staff(1, "Staff1_name", "Staff1_surname", 100000),
              new Staff(2, "Staff2_name", "Staff2_surname", 200000),
              new Staff(3, "Staff3_name", "Staff3_surname", 300000),
              new Staff(4, "Staff4_name", "Staff4_surname", 400000),
              new Staff(5, "Staff5_name", "Staff5_surname", 500000),
              new HRManagers(6, "HR1_FullName", 100000),
              new HRManagers(7, "HR2_FullName", 200000),
              new HRManagers(8, "HR3_FullName", 300000),
              new HRManagers(9, "HR4_FullName", 400000),
              new HRManagers(10, "HR5_FullName", 500000),
              new Programmers(11, "Prog1_NickName", 1000000, 100000, 1.0),
              new Programmers(12, "Prog2_NickName", 2000000, 200000, 0.99),
              new Programmers(13, "Prog3_NickName", 3000000, 300000, 0.90),
              new Programmers(14, "Prog4_NickName", 4000000, 400000, 0.92),
              new Programmers(15, "Prog5_NickName", 5000000, 500000, 0.95)
      };
      int ind = 0;
      double max = Double.MIN_VALUE;
      for (int i=0; i< workers.length; i++){
          if(workers[i].getSalary()>max){
              max= workers[i].getSalary();
              ind=i;
          }
      }
        System.out.println("a) "+workers[ind].getWorkerData());
        System.out.println("----------------------------------------");
        System.out.println("b) ");

      Workers tmp;
      Boolean flag = false;

      while (!flag) {
          flag = true;
          for (int i = 0; i < workers.length-1; i++) {
              if (workers[i].getSalary() < workers[i+1].getSalary()) {
                  flag = false;
                  tmp = workers[i];
                  workers[i] = workers[i+1];
                  workers[i+1] = tmp;
              }
          }
      }
      for (int i=0; i< workers.length; i++){
          System.out.println(workers[i].getWorkerData());
      }

    }

}