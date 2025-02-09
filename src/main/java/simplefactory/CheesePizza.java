package simplefactory;

import static simplefactory.Constants.CHEESE_DESCRIPTION;

public class CheesePizza implements Pizza{
    @Override
    public String getDescription() {
        return CHEESE_DESCRIPTION;
    }
}
