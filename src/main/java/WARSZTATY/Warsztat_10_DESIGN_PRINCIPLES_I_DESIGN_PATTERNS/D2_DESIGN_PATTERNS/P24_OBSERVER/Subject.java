package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P24_OBSERVER;

public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);
}
