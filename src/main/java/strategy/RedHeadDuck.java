package strategy;

public class RedHeadDuck implements Duck{
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
