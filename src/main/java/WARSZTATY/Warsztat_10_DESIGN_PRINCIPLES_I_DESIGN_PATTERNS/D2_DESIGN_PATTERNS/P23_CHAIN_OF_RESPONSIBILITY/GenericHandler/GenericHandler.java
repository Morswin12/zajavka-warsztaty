package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P23_CHAIN_OF_RESPONSIBILITY.GenericHandler;

public abstract class GenericHandler<T> {

    protected GenericHandler<T> nextHandler;

    public void setNextHandler(GenericHandler<T> nextHandler) {
        this.nextHandler = nextHandler;
    }

    public T handle(T input) {
        T t = handleInput(input);
        if (nextHandler != null) {
            return nextHandler.handle(t);
        }
        return t;
    }

    protected abstract T handleInput(T input);
}
