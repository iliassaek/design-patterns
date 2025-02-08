package simplefactory;

import static simplefactory.Constants.CHEESE_TYPE;

public class CheesePizza implements Pizza{
    @Override
    public String getType() {
        return CHEESE_TYPE;
    }
}
