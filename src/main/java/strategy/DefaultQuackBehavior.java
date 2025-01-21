package strategy;

public class DefaultQuackBehavior implements QuackBehavior{
    @Override
    public String quack() {
        return Constants.DEFAULT_QUACK;
    }
}
