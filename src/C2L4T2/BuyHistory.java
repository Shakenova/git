package C2L4T2;

import java.util.Date;

public class BuyHistory {
    private String goodName;
    private int goodPrice;
    private Date buyTime;

    BuyHistory(){}
    BuyHistory(String goodName, int goodPrice){
        this.goodName=goodName;
        this.goodPrice=goodPrice;
        this.buyTime= new Date();
    }

    public void setGoodName(String goodName){ this.goodName=goodName;}
    public String getGoodName(){return goodName;}

    public void setGoodPrice(int goodPrice){ this.goodPrice=goodPrice;}
    public int getGoodPrice(){return goodPrice;}

    public void setBuyTime(Date buyTime){ this.buyTime= buyTime;}
    public Date getBuyTime(){ return buyTime;}

    @Override
    public String toString(){
        return goodName+" - "+goodPrice+" EUR - "+buyTime;
    }


}
