public class AppleRedAndHeavyPredicate implements ApplePredicate{
    Main.Color RED = Main.Color.RED;
    @Override
    public boolean test(Apple apple) {
        return RED.equals(apple.getColor())&&apple.getWeight()>150;
    }
}
