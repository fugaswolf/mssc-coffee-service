package guru.springframework.mssccoffeeservice.web.controller;

import guru.springframework.mssccoffeeservice.web.model.CoffeeDto;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/coffee")
public class CoffeeController {

    @GetMapping("/{coffeeId}")
    public ResponseEntity<CoffeeDto> getCoffeeById(@PathVariable("coffeeId") UUID coffeeId){

        //todo impl
        return new ResponseEntity<>(CoffeeDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewCoffee(@RequestBody CoffeeDto coffeeDto){
        //todo impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{coffeeId}")
    public ResponseEntity updateCoffeeById(@PathVariable("coffeeId") UUID coffeeId, @RequestBody CoffeeDto coffeeDto){
        //todo impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
