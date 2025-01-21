package strategy;

public class MallardDuck implements Duck{
    //TODO: make dependencies final
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public MallardDuck(){
        quackBehavior = new DefaultQuackBehavior();
        flyBehavior = new DefaultFlyBehavior();
    }

    public MallardDuck(FlyBehavior flyBehavior){
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
