package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @GetMapping("/cars")
    public CarDTO getNewCar(){
        return new CarDTO("1qaz","panda",10000);
    }

    @PostMapping(value = "/cars")
    public String printCar(@RequestBody CarDTO carDTO){
        return new ResponseEntity<String>("car created", HttpStatus.OK) + " "+ carDTO.toString();

    }

}