package com.romijulianto.restapicarspringboot.services;

import com.romijulianto.restapicarspringboot.entities.CarEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface CarService {

    /* method moving from Controller */
    CarEntity addCar(CarEntity param);

    List<CarEntity> getAllCar();

    CarEntity getCarById(int id);

    CarEntity updateCar(CarEntity param);

    void deleteCar(int id);
}
