package strategy;

public class DefaultFlyBehavior implements FlyBehavior{
    @Override
    public String fly() {
        return Constants.DEFAULT_FLY;
    }
}
