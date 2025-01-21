package strategy;

public class HardQuack implements QuackBehavior {
    @Override
    public String quack() {
        return "Qacking hard: QUACK QUAAAAAAAAAAAAACK";
    }
}
