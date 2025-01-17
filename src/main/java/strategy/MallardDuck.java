package strategy;

public class MallardDuck implements Duck{
    @Override
    public String quack() {
        return "MallardDuck --> quack quack";
    }

    @Override
    public String fly() {
        return "MallardDuck --> fly fly";
    }
}
