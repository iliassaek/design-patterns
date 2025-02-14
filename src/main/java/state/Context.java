package state;

public class Context {
    private State state;

    public Context(State a) {
        this.state = a;
    }

    public State getState(){
        return this.state;
    }

    public void request(){
        this.state = new ConcreteStateB();
    }
}
