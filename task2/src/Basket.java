import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<Ball> memory;

    static List<Ball> basketBalls = new ArrayList();

    public List<Ball> getBasketBalls() {
        return basketBalls;
    }

    public void setBasketBalls(List<Ball> basketBalls) {
        this.basketBalls = basketBalls;
    }

}
