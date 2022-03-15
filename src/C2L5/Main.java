package C2L5;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true){

            System.out.println("PRESS [1] TO ADD PLAYER");
            System.out.println("PRESS [2] TO LIST PLAYERS");
            System.out.println("PRESS [3] TO DELETE PLAYER");
            System.out.println("PRESS [4] TO GET TOTAL ANALYTICS ON PLAYERS PRICE");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name");
                String name = in.next();

                System.out.println("Insert club");
                String club = in.next();

                System.out.println("Insert price");
                int price = in.nextInt();

                Player pl = new Player(name, club, price);
                ArrayList players = readPlayers();
                players.add(pl);
                savePlayers(players);

            }else if(choice.equals("2")){

                ArrayList players = readPlayers();
                for (int i = 0; i<players.size(); i++) {
                    System.out.println((i+1) + ") "+players.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
                }

            }else if (choice.equals("3")){

                ArrayList players = readPlayers();
                for (int i = 0; i<players.size(); i++) {
                    System.out.println((i+1) + ") "+players.get(i)); // Выводим данные игрока в красивом формате, с нумерацией
                }

                System.out.println("Insert index of player to delete: ");
                int index = in.nextInt(); //Вводим порядковый номер игрока из списка от 1 до размера
                players.remove(index-1);

                savePlayers(players);

            }else if(choice.equals("4")){

                int sum = 0;
                //Получаем актуальные данные
                ArrayList<Player> players = readPlayers();
                for (Player p: players){
                    sum+=p.getPrice();
                }
                System.out.println("The total cost of the players "+sum);

            }else if (choice.equals("0")){

                System.exit(0); // Выход из программы

            }else{
                System.out.println("Wrong command!!!"); //Если вы ввели неверную команду
            }
        }
    }

    public static void savePlayers(ArrayList players){
        try{
            ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream("bitlab.data"));
            outStream.writeObject(players);
            outStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static ArrayList readPlayers(){
        ArrayList players = new ArrayList<>();
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("bitlab.data"));
            players = (ArrayList)inputStream.readObject();
            inputStream.close();
        }catch (Exception e){

        }
        return players;
    }
}

