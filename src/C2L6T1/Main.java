package C2L6T1;

public class Main {
    public static void main(String[] args){
        Operation o1 = new Operation("Add Client to Bank",1);
        Operation o2 = new Operation("Delete Client from Bank",2);
        Operation o3 = new Operation("Add Account to Bank",3);
        Operation o4 = new Operation("Edit Client", 4);
        Operation o5 = new Operation("Edit Account",5);
        Operation o6 = new Operation("Close Account",6);
        Operation o7 = new Operation("Block Account", 7);
        Operation o8 = new Operation("Unblock Account", 8);
        Operation o9 = new Operation("Change Status", 9);
        Operation o10 = new Operation("Set limit",10);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
        o6.start();
        o7.start();
        o8.start();
        o9.start();
        o10.start();
    }
}
