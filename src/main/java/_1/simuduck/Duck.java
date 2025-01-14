package _1.simuduck;

abstract class Duck {
    public void quack() {
        System.out.println("quack quack...");
    }

    public void swim() {
        System.out.println("swim swim");
    }

    public abstract void display();
}


class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Mallard Duck: ");
        quack();
        swim();
    }
}
