package Aygerim.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player p[] =
        {
         new Player(7, "Криштиану", "Роналду", "нападающий"),
         new Player(6, "Поль", "Погба", "полузащитник"),
         new Player(19, "Рафаэль", "Варан", "защитник"),
         new Player(23, "Люк", "Шоу", "защитник"),
         new Player(1, "Амад", "Диалло", "нападающий")
        };
        Player p1[] =
         {
         new Player(19, "Мэйсон", "Маунт", "полузащитник"),
         new Player(29, "Кай", "Хаверц", "полузащитник"),
         new Player(16, "Эдуар", "Мэнди", "вратарь"),
         new Player(24, "Рис", "Джеймс", "защитник"),
         new Player(11, "Тимо", "Вернер", "нападающий")
         };
        Club c[]=
         {
          new Club("Манчестер Юнайтед","Англия", 6, p),
          new Club("Челси","Англия", 3, p1)
         };
        for(int i=0; i<c.length; i++){
            c[i].printClubData();
        }
    }
}