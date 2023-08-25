package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

import org.jsoup.nodes.Attribute;

public class AttributeAfterDecorator extends AttributeDecorator{
    public AttributeAfterDecorator(Attribute attribute) {
        super(attribute);
    }

    @Override
    public String getKey() {
        String key = super.getKey();
        System.out.println("Decorating after getKey()");
        return key;
    }
}
