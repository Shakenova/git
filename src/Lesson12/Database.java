package Lesson12;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];
    static{
        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev", 20000,"KZ010322312","0102");
        allAccounts[1] = new CityBankAccount("Erbol","Assanbek", 10000,"KZ010322313","0101");
        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev", 2000,"KZ0101112","0102");
        allAccounts[3] = new NationalBankAccount("Aygerim Shakenova", 5000, "KZ1234567", "1234");
        allAccounts[4] = new CityBankAccount("Vasiliy","Pupkin", 30000,"KZ010322456","0190");
        allAccounts[5] = new CityBankAccount("Denis","Vasilev", 4000,"KZ010322884","0806");
        allAccounts[6] = new CityBankAccount("Erbolat","Assylbek", 9000,"KZ010322036","0862");
        allAccounts[7] = new NationalBankAccount("Ilyasbek Kuanyshev", 8000,"KZ0101954","3596");
        allAccounts[8] = new NationalBankAccount("Altynai Aytimbetova", 60000, "KZ1234749", "3482");
        allAccounts[9] = new NationalBankAccount("Araylym Akhmetova", 50000, "KZ1234638", "9504");
    }
}
