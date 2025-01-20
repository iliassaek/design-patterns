package strategy;

public class DefaultFlyBehavior implements FlyBehavior{
    @Override
    public String fly() {
        return "default fly behavior: fly fly";
    }
}
