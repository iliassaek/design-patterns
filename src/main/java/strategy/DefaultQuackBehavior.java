package strategy;

public class DefaultQuackBehavior implements QuackBehavior{
    @Override
    public String quack() {
        return "Default Quack Behavior: Quack quack";
    }
}
