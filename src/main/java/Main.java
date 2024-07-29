import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        System.out.println("Введите название машины № 1");
        String name1 = scanner.nextLine();
        int speed1;
        while (true) {
            System.out.println("Введите скорость машины №1");
            speed1 = scanner.nextInt();
            scanner.nextLine();
            if (speed1 > 0 && speed1 <= 250) {
                break;
            } else {
                System.out.println("Введите скрость от 1 до 250");
            }
        }

        System.out.println("Введите название машины № 2");
        String name2 = scanner.nextLine();
        int speed2;
        while (true) {
            System.out.println("Введите скорость машины №2");
            speed2 = scanner.nextInt();
            scanner.nextLine();
            if (speed2 > 0 && speed2 <= 250) {
                break;
            } else {
                System.out.println("Введите скрость от 1 до 250");
            }
        }

        System.out.println("Введите название машины № 3");
        String name3 = scanner.nextLine();
        int speed3;
        while (true) {
            System.out.println("Введите скорость машины №3");
            speed3 = scanner.nextInt();
            scanner.nextLine();
            if (speed3 > 0 && speed3 <= 250) {
                break;
            } else {
                System.out.println("Введите скрость от 1 до 250");
            }
        }

        Car car1 = new Car (name1, speed1);
        Car car2 = new Car (name2, speed2);
        Car car3 = new Car (name3, speed3);

        race.winner(car1);
        race.winner(car2);
        race.winner(car3);

        System.out.println("Самая быстрая машина: " + race.leaderCar);

    }
}
