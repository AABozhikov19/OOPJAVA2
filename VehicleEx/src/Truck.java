public class Truck extends Vehicle {
    private String brand;
    private String model;
    private int year;

    public Truck(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void start() {
        start();
    }

    @Override
    public void stop() {
        stop();
    }
}
