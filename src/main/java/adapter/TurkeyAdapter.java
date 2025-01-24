package adapter;

public class TurkeyAdapter implements Duck{
    @Override
    public String quack() {
        return Constants.GOBBLING;
    }
}
