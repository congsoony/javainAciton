public class AplleGreenColorPredicate implements ApplePredicate{
    Main.Color GREEN = Main.Color.GREEN;
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
