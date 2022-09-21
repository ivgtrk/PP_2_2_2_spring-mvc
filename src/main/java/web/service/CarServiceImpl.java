package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements ICarService {
    public List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Model1", "series1", 200));
        cars.add(new Car("Model2", "series2", 250));
        cars.add(new Car("Model3", "series3", 300));
        cars.add(new Car("Model4", "series4", 350));
        cars.add(new Car("Model5", "series5", 400));
    }

    @Override
    public List<Car> getCarsList(Integer count) {
        return cars.stream().limit(count).toList();
    }
}
