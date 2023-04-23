package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad3;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO implements Person {
    private StackInvoices stackInvoices;

    public CEO(StackInvoices stackInvoices) {
        this.stackInvoices = stackInvoices;
    }

    public void addInvoice(String scaneredString) {
        Pattern pattern1 = Pattern.compile("^CEO: ADD INVOICE\\(\\d+\\.\\d+\\)$");
        /*
        "^" - oznacza początek tekstu
        "CEO: ADD INVOICE" - oznacza dokładnie taki tekst
        "\(" i "\)" - oznaczają nawiasy, które trzeba "ucieczać" znakiem ukośnika
        "\d+\.\d+" - oznacza jedno lub więcej cyfr dziesiętnych, oddzielonych kropką
        "$" - oznacza koniec tekstu
         */
        Matcher matcher1 = pattern1.matcher(scaneredString);

        if (matcher1.matches()) {
            Pattern pattern = Pattern.compile("\\((\\d+\\.\\d+)\\)");
            Matcher matcher = pattern.matcher(scaneredString);
            if (matcher.find()) {
                String kwota = matcher.group(1);
                System.out.println(scaneredString);
                Invoice invoice = new Invoice(new BigDecimal(kwota));
                this.stackInvoices.addInvoiceToStack(invoice);
                System.out.println();
            }
        } else {
            System.out.println("O co Ci chodzi?\n");
        }
    }
}
