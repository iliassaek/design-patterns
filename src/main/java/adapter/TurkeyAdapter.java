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
        var builder = new StringBuilder();
        for (int i=0; i<3;i++){
            builder.append(turkey.fly()).append("...");
        }
        return builder.toString();
    }
}
