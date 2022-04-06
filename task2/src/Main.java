import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// creating the ball

        Scanner scanner = new Scanner(System.in);
        System.out.println("1-create ball, 0-exit");
        int command = scanner.nextInt();

        List<Ball> ballList = new ArrayList<>();
        if (command == 1 || command == 0) {
            while (command != 0) {
                if (command != 0) {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the color of ball: ");
                    String color = scanner.nextLine();
                    scanner = new Scanner(System.in);
                    System.out.print("Enter the weight of ball: ");
                    double weight = scanner.nextDouble();

                    Ball ball = new Ball(color, weight);
                    ballList.add(ball);

                    System.out.println("1-create ball, 0-exit");
                    command = scanner.nextInt();

                } else {
                    break;
                }
            }
        } else {
            System.out.println("You entered wrong command retry");
            return;
        }


// fill basket
        scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls to fill the basket with balls: ");
        int number = scanner.nextInt();
        BasketService.fillRandomBasket(ballList, number);
        System.out.println(number + " balls in basket");

// get info

        System.out.println("1-to get info, 0-exit");
        scanner = new Scanner(System.in);
        int run = scanner.nextInt();
        if (run == 1 || run == 0) {
            while (run != 0) {
                scanner = new Scanner(System.in);
                System.out.print("Enter the color of ball to get info: ");
                String color = scanner.nextLine();

                String s = BasketService.infoAboutBalls(Basket.basketBalls, color);
                System.out.println(s);

                System.out.println("1-to get info, 0-exit");
                scanner = new Scanner(System.in);
                run = scanner.nextInt();
            }
        } else {
            System.out.println("You entered wrong command retry");
            return;
        }
    }
}

