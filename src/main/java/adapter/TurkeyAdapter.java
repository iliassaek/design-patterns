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

    @Override
    public String fly() {
        return "turkey can fly long distance";
    }
}
