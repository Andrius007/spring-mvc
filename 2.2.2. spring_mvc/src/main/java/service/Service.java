package service;

import Model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {
    private static List<Car> carsList;

    public static List<Car> createCars() {
        carsList = new ArrayList<>();
        carsList.add(new Car(1, "black", 50));
        carsList.add(new Car(2, "white", 40));
        carsList.add(new Car(3, "green", 30));
        carsList.add(new Car(4, "blue", 20));
        carsList.add(new Car(5, "red", 10));


        return carsList;
    }

    public static List<Car> selectCars(Integer kolichestvo) {

        createCars();
        return ((kolichestvo != null) && (kolichestvo <= carsList.size() - 1)) ? carsList.subList(0, kolichestvo) : carsList;
    }
}
