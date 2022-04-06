import java.util.List;

public class BasketService {


    public static void fillRandomBasket(List<Ball> ballList, int number) {

        for (int i = 0; i < number; i++) {
            if (ballList.size() > 0) {
                Ball ball = ballList.get((int) (Math.random() * ((ballList.size() - 1) + 1)));
                Basket.basketBalls.add(ball);
            }
        }
    }

    public static String infoAboutBalls(List<Ball> balls, String colorOfBall) {

        int count = 0;
        double weight = 0;


        for (Ball ball : balls) {
            if (ball.getColor().equals(colorOfBall)) {
                count++;
                weight += ball.getWeight();
            }
        }
        return "there are " + count + " " + colorOfBall + " color balls in basket and their total weight is " + weight;
    }

}
