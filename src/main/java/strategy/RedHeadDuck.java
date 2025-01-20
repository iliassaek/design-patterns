package strategy;

public class RedHeadDuck implements Duck{
    public static final String QUACK_QUACK = "Red head duck: Quack quack";
    public static final String FLY_FLY = "Red head duck is flying .....";

    private FlyBehavior flyBehavior;

    public RedHeadDuck() {
        flyBehavior= new DefaultFlyBehavior();
    }

    public RedHeadDuck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public String quack() {
        return QUACK_QUACK;
    }

    @Override
    public String fly() {
        return flyBehavior.fly();
    }
}
