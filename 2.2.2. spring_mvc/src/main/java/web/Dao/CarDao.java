package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add( new Car("BMW", "BLACK", 3));
        cars.add( new Car("MERSEDES", "WHITE", 63));
        cars.add( new Car("MAZDA", "RED", 5));
        cars.add( new Car("VOLVO", "SILVER", 750));
        cars.add( new Car("LADA", "BLACK", 9));
    }

    public List<Car> getAllCars(){
        return cars;
    }

    public List<Car> getCars(String count){
        if(count == null){
            return getAllCars();
        }else{
            int lot = Integer.parseInt(count);
            if(lot >= 5 || lot < 1){
                return getAllCars();
            }else {
                return getAllCars().stream().limit(lot).collect(Collectors.toList());
            }
        }

    }

}
