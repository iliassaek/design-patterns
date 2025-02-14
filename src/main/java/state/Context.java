package state;

public class Context {
    private State state;

    public Context(ConcreteStateA a) {
        this.state = a;
    }

    public State getState(){
        return this.state;
    }
}
