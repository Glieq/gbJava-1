import java.time.LocalDateTime;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minutes = now.getMinute();
        System.out.println(hour);
        System.out.println(minutes);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите ваше имя: ");
        String name = iScanner.nextLine();
        if ((hour >= 5 & hour <= 11)) {
            System.out.printf("Доброе утро!, %s!", name);
        }
        if (hour >= 12 & hour <= 17) {
            System.out.printf("Добрый день!, %s!", name);
        }
        if (hour >= 18 & hour <= 22) {
            System.out.printf("Добрый вечер!, %s!", name);
        }
        if (hour >= 23 & hour <= 4) {
            System.out.printf("Доброй ночи!, %s!", name);
        }

        iScanner.close();
    }
}
