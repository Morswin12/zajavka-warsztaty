package WARSZTATY.Warsztat_1_GENERICS_Klasy_generyczne.P36_Zadania_Zaawansowane_kolekcje.Zad3;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.Queue;

public class StackInvoices {
    private BigDecimal amountsSum = BigDecimal.ZERO;
    private final ArrayDeque<Invoice> invoiceQueue = new ArrayDeque<>();


    public void addInvoiceToStack(Invoice invoice) {
        this.invoiceQueue.push(invoice);
        this.amountsSum = this.amountsSum.add(invoice.getAmount());
        System.out.println("CEO added invoice: ID: " + invoice.getId() + ", amount: " + invoice.getAmount());
        printActualQueen();
    }

    public void removeInvoiceFromStack() {
        Invoice pop = this.invoiceQueue.pop();
        this.amountsSum = this.amountsSum.subtract(pop.getAmount());
        System.out.println("ACCOUNTANT processed invoice: ID: " + pop.getId() + ", amount: " + pop.getAmount());
        printActualQueen();
    }

    public Queue<Invoice> getInvoiceQueue() {
        return invoiceQueue;
    }
    public void printActualQueen() {
         System.out.print("Current invoices amount: " + amountsSum +". Invoices: [");
        for (Invoice invoice : invoiceQueue) {
            System.out.print(invoice + ", ");
        }
        System.out.print("]\n");

    }
}
