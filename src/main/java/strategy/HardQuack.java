package strategy;

public class HardQuack implements QuackBehavior {
    @Override
    public String quack() {
        return Constants.QUACK_HARD;
    }
}
