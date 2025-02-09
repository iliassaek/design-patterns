package simplefactory;

import static simplefactory.Constants.VEGETARIAN_DESCRIPTION;

public class VegetarianPizza implements Pizza{
    @Override
    public String getDescription() {
        return VEGETARIAN_DESCRIPTION;
    }
}
