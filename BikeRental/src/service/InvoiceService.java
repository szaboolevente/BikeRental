package service;

import data.InMemoryDatabase;
import exceptions.EntityNotFoundException;
import model.Invoice;

import java.util.List;

public class InvoiceService {
    private InMemoryDatabase database;

    public InvoiceService(InMemoryDatabase database) {
        this.database = database;
    }

    public void addInvoice(Invoice invoice) {
        database.addInvoice(invoice);
    }

    public void updateInvoice(Invoice invoice) throws EntityNotFoundException {
        database.updateInvoice(invoice);
    }

    public void deleteInvoice(String invoiceId) throws EntityNotFoundException {
        database.deleteInvoice(invoiceId);
    }

    public List<Invoice> getInvoices() {
        return database.getInvoices();
    }
}
