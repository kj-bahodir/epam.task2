public class Ball {
   private String color;
   private Double weight;

    public Ball() {
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Ball(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }
}
