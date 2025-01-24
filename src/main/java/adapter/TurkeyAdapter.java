package adapter;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter() {
        turkey = new WildTurkey();
    }

    @Override
    public String quack() {
        return turkey.gobble();
    }
}
