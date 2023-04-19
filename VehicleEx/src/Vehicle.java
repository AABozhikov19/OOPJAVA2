public abstract class Vehicle {
    public abstract String getBrand();
    public abstract String getModel();
    public abstract int getYear();
    public abstract void start();
    public abstract void stop();

    Vehicle car = new Car("Toyota", "Corolla", 2017);
    Vehicle truck = new Truck("Ford", "Maverick", 2015);
    Vehicle motorcycle = new Motorcycle("Suzuki", "Gamma XR89", 2019);
}