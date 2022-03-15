package C2L5T2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (true){

            System.out.println("PRESS 1 TO CREATE GAME");
            System.out.println("PRESS 2 TO ADD PLAYER TO GAME");
            System.out.println("PRESS 3 TO PLAY GAME");
            System.out.println("PRESS 0 TO EXIT");
            int n = in.nextInt();

            if(n==1){
                //players.clear();
                System.out.println("Game name:");
                String gName = in.next();
                System.out.println("IP Address:");
                String ipAddr = in.next();
                System.out.println("PORT:");
                int p = in.nextInt();

                ArrayList players = new ArrayList<>();
                Game g = new Game(gName, ipAddr, p, players);
                ArrayList<Game> games = readGame();
                games.add(g);
                saveGame(games);

            }else if(n==2){
                System.out.println("CHOOSE GAME:");
                ArrayList<Game> games = readGame();
                for(int i=0;  i<games.size();i++){
                    System.out.println(i+1+") " +games.get(i).toString());
                }
                int m = in.nextInt();
                System.out.println(games.get(m-1).toString());
                System.out.println("NickName:");
                String nickName = in.next();
                System.out.println("Rating: ");
                double rating = in.nextDouble();
                Players pl = new Players(nickName, rating);
                games.get(m-1).addPlayer(pl);
                saveGame(games);



            }else if(n==3){
                ArrayList<Game> games = readGame();
                if(games.size()==0){
                    System.out.println("No games");
                }else {
                    for (int i = 0; i < games.size(); i++) {
                        System.out.println(games.get(i).toString());
                    }
                }
            }else if(n==0){
                System.exit(0);
            }else{
                System.out.println("Wrong command!!!");
            }

        }

    }

    public static void saveGame(ArrayList<Game> game){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
            outStream.writeObject(game);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList readGame(){
        ArrayList<Game> game = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("settings.data"));
            game = (ArrayList)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return game;
    }

    }

