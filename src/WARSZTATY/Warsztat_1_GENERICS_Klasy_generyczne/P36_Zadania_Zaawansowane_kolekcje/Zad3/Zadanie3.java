package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad3;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("CEO: ADD INVOICE(19.20)");
        stringList.add("CEO: ADD INVOICE(31.40)");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");
        stringList.add("CEO: ADD INVOICE(21.20)");
        stringList.add("CEO: ADD INVOICE(120.99)");
        stringList.add("CEO: ADD INVOICE(120.99)");
        stringList.add("CEO: aasa ADD INVOICE(120.99)");
        stringList.add("CEO: ADD INVOICE(120.99)");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");
        stringList.add("ACCOUNTANT: PROCESS INVOICE");

        StackInvoices stackInvoices = new StackInvoices();
        CEO ceo = new CEO(stackInvoices);
        ACCOUNTANT accountant = new ACCOUNTANT(stackInvoices);
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String string = scanner.nextLine();
//            if (string.contains("CEO")) {
//                ceo.addInvoice(string);
//            }
//            if (string.contains("ACCOUNTANT")) {
//                accountant.processInvoice();
//            }

        for (String s : stringList) {
            if (s.contains("CEO")) {
                ceo.addInvoice(s);
            } else if (s.contains("ACCOUNTANT")) {
                accountant.processInvoice(s);
            } else {
                System.out.println("O co Ci chodzi?");
            }
        }
    }
}

