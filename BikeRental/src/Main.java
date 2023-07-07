import data.InMemoryDatabase;
import exceptions.EntityNotFoundException;
import model.Bike;
import service.BikeService;

public class Main {
    public static void main(String[] args) {
        InMemoryDatabase database = new InMemoryDatabase();
        BikeService bikeService = new BikeService(database);

        Bike bike1 = new Bike("1", "Gepida", 100000);
        Bike bike2 = new Bike("2", "MTB", 220000);
        Bike bike3 = new Bike("3", "Csepel", 50000);


        bikeService.addBike(bike1);
        bikeService.addBike(bike2);
        bikeService.addBike(bike3);

        System.out.println("Bikes:");
        bikeService.getBikes().forEach(System.out::println);

        // Bike módosítása
        bike1.setPrice(80000);
        try {
            bikeService.updateBike(bike1);
            System.out.println("Bike updated: " + bike1);
        } catch (EntityNotFoundException e) {
            System.out.println("Bike not found with ID: " + bike1.getId());
        }

        // Bike törlése
        String bikeIdToDelete = "2";
        try {
            bikeService.deleteBike(bikeIdToDelete);
            System.out.println("Bike deleted with ID: " + bikeIdToDelete);
        } catch (EntityNotFoundException e) {
            System.out.println("Bike not found with ID: " + bikeIdToDelete);
        }

        System.out.println("Bikes after deletion:");
        bikeService.getBikes().forEach(System.out::println);
    }
}
