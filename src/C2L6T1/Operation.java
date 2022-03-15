package C2L6T1;

import java.util.concurrent.TransferQueue;

public class Operation extends Thread{
    private String operationName;
    private int operationTime;

    Operation(String operationName, int operationTime){
        this.operationName=operationName;
        this.operationTime=operationTime;
    }

    @Override
    public void run(){
        try{
            System.out.println("Operation '"+operationName+"': started");
            for(int i=1; i<operationTime+1;i++){
                System.out.println("Operation '"+operationName+"':"+i+" second" );
                Thread.sleep(500);
            }
            System.out.println(" ");

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Operation '"+operationName+": finished");
    }

}
