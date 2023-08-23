package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P13_ABSTRACT_FACTORY;

public interface AbstractFactory<T> {

    T create(String type);
}
