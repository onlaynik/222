package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServicelmpl implements CarService {

    @Override
    public List<Car> listCar(){
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Lada", "black", 2008, 199999));
        cars.add(new Car("Lada", "white", 2007, 19999));
        cars.add(new Car("Lada", "green", 2006, 1999));
        cars.add(new Car("Lada", "orange", 2005, 199));
        cars.add(new Car("Lada", "yelow", 2004, 19));

        return cars;
    }

    @Override
    public List<Car> showCars(Integer count){
        if ((count == null) || (count >= listCar().size())){
            return listCar();
        }
        return listCar().stream().limit(count).collect(Collectors.toList());
    }

}
