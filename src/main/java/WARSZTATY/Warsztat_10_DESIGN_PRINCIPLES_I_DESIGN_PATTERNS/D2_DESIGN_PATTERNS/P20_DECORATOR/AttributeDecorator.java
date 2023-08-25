package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

import org.jsoup.nodes.Attribute;

public abstract class AttributeDecorator extends Attribute {

    private final Attribute attribute;
    public AttributeDecorator(Attribute attribute) {
        super(attribute.getKey(), attribute.getValue());
        this.attribute = attribute;
     }

    @Override
    public String getKey() {
        String key = super.getKey();
        System.out.println("asdf");
        return key;
    }
}
