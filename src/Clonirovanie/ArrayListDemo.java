package Clonirovanie;

import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[]) {
        ArrayList<StringBuilder> arrlist1 = new ArrayList<StringBuilder>();
        arrlist1.add(new StringBuilder("Learning-"));
        ArrayList arrlist2 = (ArrayList) arrlist1.clone();
        StringBuilder strbuilder = arrlist1.get(0);
        strbuilder.append("list1, list2-both pointing to the same StringBuilder");
        System.out.println("The 1st list prints: ");
        for (int i = 0; i < arrlist1.size(); i++) {
            System.out.print(arrlist1.get(i) + " ");
        }
        System.out.println("");
        System.out.println("The 2nd list prints the same i.e:");
        for (int i = 0; i < arrlist2.size(); i++) {
            System.out.print(arrlist2.get(i));
        }
    }
}