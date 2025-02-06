package simplefactory;

public class ProductFactory {
    static Pizza createPizza(String type){
        return new CheesePizza();
    }
}
