package C2L3T2;

import java.util.ArrayList;
import java.util.Comparator;

public class BankApplication {
    private String name;
    private  ArrayList<Account> accounts = new ArrayList<>();

    BankApplication(){}
    BankApplication(String name, ArrayList<Account> accounts){
        this.name=name;
        this.accounts=accounts;
    }
    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void addAccount(Account a) // Добавляет новый объект Account
    {
        accounts.add(a);
    }
    public void removeAccount(int i) // Удаляет объект со списка под индексом i
    {
        accounts.remove(i);
    }
    public Account getMaxAccount() // Возвращает объект Account у кого самый высокий баланс
    {
        double max= Double.MIN_VALUE;
        int index=0;
        for (int i=0; i<accounts.size();i++){
            if(max<accounts.get(i).getBalance()){
                max=accounts.get(i).getBalance();
                index = i;
            }
        }
        return accounts.get(index);
    }
    public double getAverageBalance() // Возвращает среднее значение баланса пользователей
    {
        double sum=0;
        for (int i=0; i<accounts.size();i++){
            sum += accounts.get(i).getBalance();
        }
        return sum/(double) accounts.size();
    }
    public double getTotalBalance() // Возвращает сумму баланса пользователей
    {
        double sum=0;
        for (int i=0; i<accounts.size();i++){
            sum += accounts.get(i).getBalance();
        }
        return sum;
    }
    public int totalAccounts()  // Возвращает количество пользователей
    {
        return accounts.size();
    }
    public String getBankData()// Возвращает имя банка, количество счетов, сумму баланса и среднее значение баланса
    {
        return "Name is:"+getName()+"; total accounts:"+totalAccounts()+"; total balance:"+getTotalBalance()+"; avg balance:"+getAverageBalance()+";";
    }

    public static Comparator<BankApplication> AvgBalance  = new Comparator<BankApplication>() {
        @Override
        public int compare(BankApplication o1, BankApplication o2) {
            return (int) (o2.getAverageBalance() - o1.getAverageBalance());
        }
    };
}
