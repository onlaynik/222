package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {


    List<Car> listCar();

    List<Car> showCars(Integer count);
}