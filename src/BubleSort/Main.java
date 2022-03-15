package BubleSort;

public class Main {
    public static void main(String[] args) {
    int a[]={5, 8, 9, 4, 6, 3};
    boolean flag = false;
    int tmp;

    while (!flag) {
        flag = true;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                flag = false;
                tmp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = tmp;

            }
        }
    }
    for (int i =0; i<a.length; i++){
        System.out.print(a[i]+" ");
    }
    }
}
