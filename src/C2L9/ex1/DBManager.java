package C2L9.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager{
    //Наш объект connection, который хранит данные по подключению. Вся движуха идет через него. Что-то на подобие Socket.
    private Connection connection;

    public void connect(){
        try{
            //Подтягиваем драйвер, который мы добавили в самом начале урока
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Создаем подключение.
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc_sample?useUnicode=true&serverTimezone=UTC","root", ""
            );
            System.out.println("CONNECTED");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}


