package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P20_DECORATOR;

import org.jsoup.nodes.Attribute;

public class Main2 {
    public static void main(String[] args) {
         // Decorator lev. 2
        System.out.println("Example1");
        Attribute attribute1 = new AttributeBeforeDecorator(new Attribute("key1", "value1"));
        System.out.println(attribute1.getKey());
        System.out.println();

        System.out.println("Example2");
        Attribute attribute2 = new AttributeAfterDecorator(new AttributeBeforeDecorator(new Attribute("key2", "value2")));
        System.out.println(attribute2.getKey());
        System.out.println();

        Attribute attribute3 = new Attribute("key3", "value3");
        System.out.println(attribute3.getKey());

    }
}
