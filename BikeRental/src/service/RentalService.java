package service;

import data.InMemoryDatabase;
import exceptions.EntityNotFoundException;
import model.Rental;

import java.util.List;

public class RentalService {
    private InMemoryDatabase database;

    public RentalService(InMemoryDatabase database) {
        this.database = database;
    }

    public void addRental(Rental rental) {
        database.addRental(rental);
    }

    public void updateRental(Rental rental) throws EntityNotFoundException {
        database.updateRental(rental);
    }

    public void deleteRental(String rentalId) throws EntityNotFoundException {
        database.deleteRental(rentalId);
    }

    public List<Rental> getRentals() {
        return database.getRentals();
    }
}
