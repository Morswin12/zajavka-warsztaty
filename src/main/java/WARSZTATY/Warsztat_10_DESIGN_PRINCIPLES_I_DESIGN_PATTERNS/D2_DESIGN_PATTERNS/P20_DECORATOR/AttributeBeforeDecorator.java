package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

import org.jsoup.nodes.Attribute;

public class AttributeBeforeDecorator extends AttributeDecorator {
    public AttributeBeforeDecorator(Attribute attribute) {
        super(attribute);
    }

    @Override
    public String getKey() {
        System.out.println("Decorating before getKey()");
        return super.getKey();
    }
}
