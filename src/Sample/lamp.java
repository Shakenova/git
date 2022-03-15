package Sample;

import java.util.Scanner;



//Основная функция

public class lamp {

    public static void main(String[] args) {

        ThreadLamp lampGo = new ThreadLamp("Релейный запуск", 0);
        while (true) // ожидание нажатия кнопки
        {
            @SuppressWarnings("resource")
            Scanner scon = new Scanner(System.in);
            String strin = scon.nextLine();
            System.out.println(strin);
            if (strin.equals("S") || strin.equals("s")) {
                System.out.println("Start");
                lampGo.start();
            } else if (strin.equals("Q") || strin.equals("Q")) {
                //lampGo.stop();
                System.out.println("Stop");
                lampGo.setSunFlag(false);
            } else {
                System.out.println("Неправильный ввод! Пожалуйста, введите заново");
            }
        }
    }

}