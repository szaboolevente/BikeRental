package data;

import exceptions.EntityNotFoundException;
import model.Bike;
import model.Customer;
import model.Invoice;
import model.Rental;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDatabase {
    private List<Bike> bikes = new ArrayList<>();
    private List<Customer> customers = new ArrayList<>();
    private List<Rental> rentals = new ArrayList<>();
    private List<Invoice> invoices = new ArrayList<>();

    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    public void updateBike(Bike bike) throws EntityNotFoundException {
        int index = getBikeIndexById(bike.getId());
        if (index != -1) {
            bikes.set(index, bike);
        } else {
            throw new EntityNotFoundException("Bike not found with ID: " + bike.getId());
        }
    }

    public void deleteBike(String bikeId) throws EntityNotFoundException {
        int index = getBikeIndexById(bikeId);
        if (index != -1) {
            bikes.remove(index);
        } else {
            throw new EntityNotFoundException("Bike not found with ID: " + bikeId);
        }
    }

    public List<Bike> getBikes() {
        return bikes;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void updateCustomer(Customer customer) throws EntityNotFoundException {
        int index = getCustomerIndexById(customer.getId());
        if (index != -1) {
            customers.set(index, customer);
        } else {
            throw new EntityNotFoundException("Customer not found with ID: " + customer.getId());
        }
    }

    public void deleteCustomer(String customerId) throws EntityNotFoundException {
        int index = getCustomerIndexById(customerId);
        if (index != -1) {
            customers.remove(index);
        } else {
            throw new EntityNotFoundException("Customer not found with ID: " + customerId);
        }
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public void updateRental(Rental rental) throws EntityNotFoundException {
        int index = getRentalIndexById(rental.getId());
        if (index != -1) {
            rentals.set(index, rental);
        } else {
            throw new EntityNotFoundException("Rental not found with ID: " + rental.getId());
        }
    }

    public void deleteRental(String rentalId) throws EntityNotFoundException {
        int index = getRentalIndexById(rentalId);
        if (index != -1) {
            rentals.remove(index);
        } else {
            throw new EntityNotFoundException("Rental not found with ID: " + rentalId);
        }
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public void updateInvoice(Invoice invoice) throws EntityNotFoundException {
        int index = getInvoiceIndexById(invoice.getId());
        if (index != -1) {
            invoices.set(index, invoice);
        } else {
            throw new EntityNotFoundException("Invoice not found with ID: " + invoice.getId());
        }
    }

    public void deleteInvoice(String invoiceId) throws EntityNotFoundException {
        int index = getInvoiceIndexById(invoiceId);
        if (index != -1) {
            invoices.remove(index);
        } else {
            throw new EntityNotFoundException("Invoice not found with ID: " + invoiceId);
        }
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    private int getBikeIndexById(String bikeId) {
        for (int i = 0; i < bikes.size(); i++) {
            if (bikes.get(i).getId().equals(bikeId)) {
                return i;
            }
        }
        return -1;
    }

    private int getCustomerIndexById(String customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId().equals(customerId)) {
                return i;
            }
        }
        return -1;
    }

    private int getRentalIndexById(String rentalId) {
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i).getId().equals(rentalId)) {
                return i;
            }
        }
        return -1;
    }

    private int getInvoiceIndexById(String invoiceId) {
        for (int i = 0; i < invoices.size(); i++) {
            if (invoices.get(i).getId().equals(invoiceId)) {
                return i;
            }
        }
        return -1;
    }
}
