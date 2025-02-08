package simplefactory;

public class ProductFactory {
    static Pizza createPizza(String type){
        if(type.equals("vegetarian")) return new VegetarianPizza();
        return new CheesePizza();
    }
}
