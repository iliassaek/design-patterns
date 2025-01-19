package _1.simuduck;

class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Mallard Duck: ");
        quack();
        swim();
    }
}
