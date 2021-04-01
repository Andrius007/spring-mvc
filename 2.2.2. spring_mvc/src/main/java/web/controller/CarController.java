package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count,
                          Model model) {
        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("Lada", "Baklazhan", 2005);
        Car car2 = new Car("Moskvich", "Red", 1970);
        Car car3 = new Car("Zaporozhec", "Indigo", 1950);
        Car car4 = new Car("Tavria", "Wet asphalt", 1960);
        Car car5 = new Car("Zhiguli", "Black", 2010);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        model.addAttribute("cars", cars.stream().limit(count).collect(Collectors.toList()));

        return "cars";
    }
}
