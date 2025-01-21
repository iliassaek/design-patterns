package strategy;

public class RedHeadDuck implements Duck{
    public static final String QUACK_QUACK = "Default Quack Behavior: Quack quack";
    public static final String FLY_FLY = "Red head duck is flying .....";

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehabior;

    public RedHeadDuck() {
        flyBehavior= new DefaultFlyBehavior();
        quackBehabior= new DefaultQuackBehavior();
    }

    public RedHeadDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public RedHeadDuck(FlyBehavior flyBhv, QuackBehavior quackBhv) {
        this.flyBehavior = flyBhv;
        this.quackBehabior = quackBhv;
    }

    @Override
    public String quack() {
        return quackBehabior.quack();
    }

    @Override
    public String fly() {
        return flyBehavior.fly();
    }
}
