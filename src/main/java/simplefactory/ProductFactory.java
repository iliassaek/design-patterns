package simplefactory;

import static simplefactory.Constants.VEGETARIAN_TYPE;

public class ProductFactory {
    static Pizza createPizza(String type){
        if(type.equals(VEGETARIAN_TYPE)) return new VegetarianPizza();
        return new CheesePizza();
    }
}
