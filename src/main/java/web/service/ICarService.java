package web.service;

import web.model.Car;
import java.util.List;

public interface ICarService {
    List<Car> getCarsList(Integer cars);
}
