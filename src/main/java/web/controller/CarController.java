package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.model.Car;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private  CarService carService;




    @GetMapping("")
    public String cars(ModelMap model,@RequestParam(required = false) Integer count){
        List<Car> carList = carService.getAllCars(count);
        model.addAttribute("carList", carList);

        return "cars";
    }
}
