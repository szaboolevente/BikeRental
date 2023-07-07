package service;

import data.InMemoryDatabase;
import exceptions.EntityNotFoundException;
import model.Customer;

import java.util.List;

public class CustomerService {
    private InMemoryDatabase database;

    public CustomerService(InMemoryDatabase database) {
        this.database = database;
    }

    public void addCustomer(Customer customer) {
        database.addCustomer(customer);
    }

    public void updateCustomer(Customer customer) throws EntityNotFoundException {
        database.updateCustomer(customer);
    }

    public void deleteCustomer(String customerId) throws EntityNotFoundException {
        database.deleteCustomer(customerId);
    }

    public List<Customer> getCustomers() {
        return database.getCustomers();
    }
}
