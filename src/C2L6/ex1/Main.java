package C2L6.ex1;

public class Main {
    public static void main(String[] args) {
        ThreadSample st1 = new ThreadSample("t1");
        ThreadSample st2 = new ThreadSample("t2");
        ThreadSample st3 = new ThreadSample("t3");

        st1.start();
        st2.start();
        st3.start();

    }
}
