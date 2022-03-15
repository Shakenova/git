package Lesson12;

import java.util.Scanner;
public class CityBankATM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter Account Number");
        String acc = in.next();
        System.out.println("Please Enter Pin Code");
        String pin = in.next();
        int ind=0;
        int a = 0;
        int b = 0;
        //boolean isCheckPin = false;
        //boolean isOnUs = false;
        for(int i=0; i<Database.allAccounts.length; i++){
            if(Database.allAccounts[i].getAccountNumber().equals(acc)){
                ind=i;
            }
        }
        if(Database.allAccounts[ind].getPinCode().equals(pin)){
            if (Database.allAccounts[ind] instanceof CityBankAccount) {
                while (a!=6) {
                    System.out.println("------------------------------------------------");
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL");
                    System.out.println("PRESS [2] TO VIEW BALANCE");
                    System.out.println("PRESS [3] TO CHANGE PIN CODE");
                    System.out.println("PRESS [4] TO CASH IN ACCOUNT");
                    System.out.println("PRESS [5] TO VIEW ACCOUNT DATA");
                    System.out.println("PRESS [6] TO EXIT");
                    System.out.println("------------------------------------------------");
                    a = in.nextInt();
                    if(a==1){
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter the summ:");
                        System.out.println("------------------------------------------------");
                        int summa=in.nextInt();
                        if (Database.allAccounts[ind].totalBalance()>=summa) {
                            Database.allAccounts[ind].debitBalance(summa);
                            System.out.println("00 Successfully completed");
                        }else{
                            System.out.println("51 Non sufficient funds");
                        }
                    }else if(a==2){
                        System.out.println(Database.allAccounts[ind].totalBalance());
                    }else if(a==3){
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter new pin:");
                        System.out.println("------------------------------------------------");
                        String newPin = in.next();
                        Database.allAccounts[ind].setPinCode(newPin);
                    }else if(a==4){
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter the summ:");
                        System.out.println("------------------------------------------------");
                        int summa=in.nextInt();
                        Database.allAccounts[ind].creditBalance(summa);
                    }else if(a==5){
                        System.out.println(Database.allAccounts[ind].accountData());
                    }else if(a==6){
                        break;
                    }
                }
            } else {
                while (b!=3){
                    System.out.println("------------------------------------------------");
                    System.out.println("PRESS [1] TO CASH WITHDRAWAL");//снятии счета, вы теряете еще 200тг со снятой суммы, так как у банкомата комиссия на другие карточки.
                    System.out.println("PRESS [2] TO VIEW BALANCE");
                    System.out.println("PRESS [3] TO EXIT");
                    System.out.println("------------------------------------------------");
                    b = in.nextInt();
                    if(b==1){
                        System.out.println("------------------------------------------------");
                        System.out.println("Enter the summ:");
                        System.out.println("------------------------------------------------");
                        int summa=in.nextInt();
                        if (Database.allAccounts[ind].totalBalance()>=summa+200) {
                            Database.allAccounts[ind].debitBalance(summa+200);
                            System.out.println("00 Successfully completed");
                        }else{
                            System.out.println("51 Non sufficient funds");
                        }
                    }else if(b==2){
                        System.out.println(Database.allAccounts[ind].totalBalance());
                    }else if(b==3){
                        break;
                    }
                }
            }

        }else{
            System.out.println("Incorrect PIN");
        }



    }
}
