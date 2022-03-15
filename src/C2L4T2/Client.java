package C2L4T2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("PRESS [1] LIST GOODS");
            System.out.println("PRESS [2] BUY GOOD");
            System.out.println("PRESS [3] LIST BUY HISTORY");
            System.out.println("PRESS [0] TO EXIT");

            int n = in.nextInt();
            if(n==1){
                ArrayList goodItems = getGoodItemList();
                for (int i = 0; i < goodItems.size(); i++) {
                    System.out.println((i + 1) + ") " + goodItems.get(i));
                }
            }else if(n==2){
                System.out.println("Enter good name");
                String goodName = in.next();
                int  goodPrice=0;
                boolean flag = false;
                ArrayList<GoodItem> goodList  = getGoodItemList();
                for ( int i=0; i< goodList.size();i++){
                    if (goodList.get(i).getName().equals(goodName)) {
                         goodPrice=goodList.get(i).getPrice();
                         flag = true;
                    }
                }
                if (flag==true) {
                    BuyHistory h = new BuyHistory(goodName, goodPrice);
                    ArrayList buyHistory = getBuyHistory();
                    buyHistory.add(h);
                    saveBuyHistory(buyHistory);
                }else{
                    System.out.println("Wrong good name");
                }
            }else if(n==3){
                ArrayList gbh = getBuyHistory();
                for (int i = 0; i < gbh.size(); i++) {
                    System.out.println((i + 1) + ") " + gbh.get(i));
                }
            }else if(n==0){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }
        }



    }

    public static void saveBuyHistory(ArrayList<BuyHistory> buyHistory){
        try{

            BufferedWriter bw = new BufferedWriter(new FileWriter("buyHistory.txt"));

            for (BuyHistory bh : buyHistory) {
                bw.write(bh.getGoodName()+"\n");
                bw.write(bh.getGoodPrice()+"\n");
                bw.write(bh.getBuyTime()+"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList<GoodItem> getGoodItemList(){
        ArrayList<GoodItem> goodItems = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("goodItems.txt"));
            String line = "";
            while((line = br.readLine())!=null){
                int price = Integer.parseInt(br.readLine());

                goodItems.add(new GoodItem(line, price));
            }
        }catch (Exception e){

        }
        return goodItems;

    }
    public static ArrayList<BuyHistory> getBuyHistory(){
        ArrayList<BuyHistory> buyHistories = new ArrayList<>();
        try{
            BufferedReader br = new BufferedReader(new FileReader("buyHistory.txt"));
            String line = "";
            while((line = br.readLine())!=null){
                int goodPrice = Integer.parseInt(br.readLine());
                String date = br.readLine();

                buyHistories.add(new BuyHistory(line, goodPrice));
            }
        }catch (Exception e){

        }
        return buyHistories;
    }

}
