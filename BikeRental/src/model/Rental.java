package model;

public class Rental {
    private String id;
    private Customer customer;
    private Bike bike;

    public Rental(String id, Customer customer, Bike bike) {
        this.id = id;
        this.customer = customer;
        this.bike = bike;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id='" + id + '\'' +
                ", customer=" + customer +
                ", bike=" + bike +
                '}';
    }
}
