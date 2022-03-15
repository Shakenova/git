package C2L3T2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> acc1 = new ArrayList<>();
        for (int i=0; i<10;i++) {
            acc1.add(new Account(i, "name"+Integer.toString(i), "surname"+Integer.toString(i), 100.2+i));
        }
        ArrayList<Account> acc2 = new ArrayList<>();
        for (int i=0; i<10;i++) {
            acc2.add(new Account(10+i, "name"+Integer.toString(i), "surname"+Integer.toString(i), 110.2+i));
        }
        ArrayList<Account> acc3 = new ArrayList<>();
        for (int i=0; i<10;i++) {
            acc3.add(new Account(20+i, "name"+Integer.toString(i), "surname"+Integer.toString(i), 120.2+i));
        }
        BankApplication a1 = new BankApplication("Bank1", acc1);
        BankApplication a2 = new BankApplication("Bank2", acc2);
        BankApplication a3 = new BankApplication("Bank3", acc3);

        ArrayList<BankApplication> allBanks = new ArrayList<>();
        allBanks.add(a1);
        allBanks.add(a2);
        allBanks.add(a3);
        BankApplication tmp;
        boolean flag = false;
        allBanks.sort(BankApplication.AvgBalance);
        for (int i =0;i<allBanks.size();i++){
            System.out.println(allBanks.get(i).getBankData());
        }
    }

}
