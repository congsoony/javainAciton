public class Apple {
    private Main.Color color;
    private int weight;

    public Apple(Main.Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Main.Color getColor() {
        return color;
    }

    public void setColor(Main.Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

