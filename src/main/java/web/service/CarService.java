package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;


import java.util.Arrays;
import java.util.List;
@Service
public class CarService {

    private static final   List<Car> carsList = Arrays.asList(
           new Car("Audi", "Black", 1994),
           new Car("Fiat", "Grey", 2000),
           new Car("Lada", "White", 2005),
           new Car("Mersedec", "Green", 2010),
           new Car("GAZ", "Blue", 2020)
   );

   public  List<Car> getAllCars(Integer count){
       return count == null || count > carsList.size() ? carsList : carsList.subList(0, count);
    }

}
