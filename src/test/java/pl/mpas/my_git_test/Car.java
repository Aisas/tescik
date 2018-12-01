package pl.mpas.my_git_test;

public class Car {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Car(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
}
