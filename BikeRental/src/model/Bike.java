package model;

public class Bike {
    private String id;
    private String brand;
    private int price;

    public Bike(String id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
