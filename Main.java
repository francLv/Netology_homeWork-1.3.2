//Сколько дней в году

import java.util.Scanner;
import static java.lang.System.*;

public class Main {
    private static int year;
    private static int yea;

    static int leap() {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            Main.yea = 1; //Високосный год
        else Main.yea = 0; //Обычный год
        return Main.yea;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int score = 0;
        int win = 1;
        while (win > 0) {
            out.println("Введите год и число дней: ");
            year = scanner.nextInt();
            int days = scanner.nextInt();
            int result = leap();
            if ((days == 366 && result == 1) || (days == 365 && result == 0)) {
                score++;
            } else {
                if (result == 1) {
                    out.println("Неправильно! В этом году " + 366 + " дней");
                    out.println("Score: " + score);
                    win = -1;
                } else {
                    out.println("Неправильно! В этом году " + 365 + " дней");
                    out.println("Score: " + score);
                    win = -1;
                }
            }

        }
    }
}