package strategy;

public class MallardDuck implements Duck{
    //TODO: make dependencies final
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public MallardDuck(){
        this.quackBehavior = new DefaultQuackBehavior();
        this.flyBehavior = new DefaultFlyBehavior();
    }

    public MallardDuck(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
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
