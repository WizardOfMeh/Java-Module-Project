import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();


        for(int i = 0; i<3; i++) {
            int number = i+1;
            System.out.println("Введите название машины №" + number);
            String name = scanner.nextLine();
            int speed;
            while (true) {
                System.out.println("Введите скорость машины №" + number);
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    scanner.nextLine();
                    if (speed > 0 && speed <= 250) {
                        break;
                    } else {
                        System.out.println("Введите скрость от 1 до 250");
                    }
                } else {
                    System.out.println("Неверный ввод, введите число");
                    scanner.next();
                }
            }

            Car car = new Car(name, speed);
            race.winner(car);
        }

        System.out.println("Самая быстрая машина: " + race.leaderCar);
    }
}
