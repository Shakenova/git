package C2L6.ex2;

public class Main {
    public static void main(String[] args) {
        ThreadRunnable tr1 = new ThreadRunnable("t1");
        ThreadRunnable tr2 = new ThreadRunnable("t2");
        ThreadRunnable tr3 = new ThreadRunnable("t3");

        Thread t1 = new Thread(tr1);
        Thread t2 = new Thread(tr2);
        Thread t3 = new Thread(tr3);

        t1.start();
        t2.start();
        t3.start();
    }
}
