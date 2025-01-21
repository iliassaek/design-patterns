package strategy;

public class MallardDuck implements Duck{

    public static final String FLY_FLY = "MallardDuck --> fly fly";

    private QuackBehavior quackBehavior;

    public MallardDuck(){
        quackBehavior = new DefaultQuackBehavior();
    }

    @Override
    public String quack() {
        return quackBehavior.quack();
    }

    @Override
    public String fly() {
        return FLY_FLY;
    }
}
