package state;

public class Context {
    private State a;

    public Context(ConcreteStateA a) {
        this.a = a;
    }

    public State getState(){
        return new ConcreteStateA();
    }
}
