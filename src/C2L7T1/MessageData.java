package C2L7T1;

import java.io.Serializable;
import java.util.Date;

public class MessageData implements Serializable {
    private String userName;
    private String messageText;
    private Date sentDate;

    public MessageData(){}
    public MessageData(String userName, String messageText){
        this.userName=userName;
        this.messageText=messageText;
        this.sentDate=new Date();
    }

    public void setUserName(String userName){this.userName=userName;}
    public String getUserName(){return userName;}

    public void setMessageText(String messageText){this.messageText=messageText;}
    public String getMessageText(){return messageText;}

    public void setSentDate(){this.sentDate=new Date();}
    public Date getSentDate(){return sentDate;}

    public String toString(){
        String s = userName + ": " + messageText + " " + sentDate;
        return s;
    }

}

