package adapter;
import static adapter.Constants.GOBBLING;

public class WildTurkey implements Turkey{
    @Override
    public String gobble() {
        return GOBBLING;
    }

    @Override
    public String fly() {
        return "Flying for short distance";
    }
}
