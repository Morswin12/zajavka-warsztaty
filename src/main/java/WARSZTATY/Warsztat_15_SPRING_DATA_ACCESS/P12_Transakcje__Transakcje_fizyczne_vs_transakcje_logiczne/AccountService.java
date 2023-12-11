package WARSZTATY.Warsztat_15_SPRING_DATA_ACCESS.P12_Transakcje__Transakcje_fizyczne_vs_transakcje_logiczne;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class AccountService {
    private InvoiceService invoiceService;

    @Transactional
    public void saveBill() {
        // ... pozostały kod
    }
}
