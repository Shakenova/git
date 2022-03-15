package C2L5T2;

import java.io.Serializable;
import java.util.ArrayList;

public class Game implements Serializable {
    private String gameName;
    private String ipAddress;
    private int port;
    private ArrayList<Players> players = new ArrayList<>();

    Game(){}
    Game(String gameName, String ipAddress, int port, ArrayList<Players> players){
        this.gameName=gameName;
        this.ipAddress=ipAddress;
        this.port=port;
        this.players=players;
    }

    public void setGameName(String gameName){this.gameName=gameName;}
    public String getGameName(){return gameName;}

    public void setIpAddress(String ipAddress){this.ipAddress=ipAddress;}
    public String getIpAddress(){return ipAddress;}

    public void setPort(int port){this.port=port;}
    public int getPort(){return port;}

    public void setPlayers(ArrayList<Players> players){this.players=players;}
    public ArrayList<Players> getPlayers(){return players;}

    public String getPlayersList() {
        String s = "";
        if (players.size() ==0) {
            s = "No players";
        }else{
            for (int i = 0; i < players.size(); i++) {
                s = s + players.get(i).toString() + "; ";
            }
        }
        return  "Players: "+s;
    }

    void addPlayer(Players player){
        players.add(player);
    }

    @Override
    public String toString(){
        return "Game:"+gameName+"; IP Address: "+ipAddress+"; PORT:"+port+"; "+getPlayersList();
    }
}
