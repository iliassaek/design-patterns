package strategy;

public class MallardDuck implements Duck{

    public static final String FLY_FLY = "MallardDuck --> fly fly";

    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public MallardDuck(){
        quackBehavior = new DefaultQuackBehavior();
        flyBehavior = new DefaultFlyBehavior();
    }

    @Override
    public String quack() {
        return quackBehavior.quack();
    }

    @Override
    public String fly() {
        return flyBehavior.fly();
    }
}
