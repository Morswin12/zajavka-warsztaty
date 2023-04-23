package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad3;

public class ACCOUNTANT implements Person {
    private StackInvoices stackInvoices;

    public ACCOUNTANT(StackInvoices stackInvoices) {
        this.stackInvoices = stackInvoices;
    }

    void processInvoice(String scaneredString) {
        if (stackInvoices.getInvoiceQueue().size() < 1) {
            System.out.println("stackInvoices is Empty I em waiting :)\n");
        } else {
            if ("ACCOUNTANT: PROCESS INVOICE".equals(scaneredString)) {
                System.out.println(scaneredString);
                this.stackInvoices.removeInvoiceFromStack();
                System.out.println();
            } else {
                System.out.println("O co Ci chodzi?\n");
            }
        }
    }
}
