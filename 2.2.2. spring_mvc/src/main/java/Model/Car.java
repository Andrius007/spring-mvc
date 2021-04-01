package Model;

import org.springframework.stereotype.Component;

@Component
public class Car {

    private int number;
    private String color;
    private int age;

    public Car() {

    }

    public Car(int number, String color, int age) {
        this.number = number;
        this.color = color;
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A " + color + " car #" + number + " had produced " + age + " years ago.";
    }
}
