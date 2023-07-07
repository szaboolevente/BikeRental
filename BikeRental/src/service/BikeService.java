package service;

import data.InMemoryDatabase;
import exceptions.EntityNotFoundException;
import model.Bike;

import java.util.List;

public class BikeService {
    private InMemoryDatabase database;

    public BikeService(InMemoryDatabase database) {
        this.database = database;
    }

    public void addBike(Bike bike) {
        database.addBike(bike);
    }

    public void updateBike(Bike bike) throws EntityNotFoundException {
        database.updateBike(bike);
    }

    public void deleteBike(String bikeId) throws EntityNotFoundException {
        database.deleteBike(bikeId);
    }

    public List<Bike> getBikes() {
        return database.getBikes();
    }
}
