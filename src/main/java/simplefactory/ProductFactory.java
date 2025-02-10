package simplefactory;

import static simplefactory.Constants.CHEESE_TYPE;
import static simplefactory.Constants.VEGETARIAN_TYPE;

public class ProductFactory {
    static Pizza createPizza(String type){

        Pizza pizza = switch (type){
            case VEGETARIAN_TYPE -> new VegetarianPizza();
            case CHEESE_TYPE -> new CheesePizza();
            default -> throw new IllegalArgumentException();
        };
        return pizza;
    }
}
