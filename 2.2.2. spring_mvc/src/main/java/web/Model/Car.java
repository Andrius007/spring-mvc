package web.Model;

public class Car {
    private String model;
    private String color;
    private int yearOfBuilt;

    public Car(String model, String color, int yearOfBuilt) {
        this.model = model;
        this.color = color;
        this.yearOfBuilt = yearOfBuilt;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfBuilt() {
        return yearOfBuilt;
    }

}
