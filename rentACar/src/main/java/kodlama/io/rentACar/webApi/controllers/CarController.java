package kodlama.io.rentACar.webApi.controllers;

import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.create.CreateCarRequest;
import kodlama.io.rentACar.business.responses.GetAllCarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@AllArgsConstructor
public class CarController {

    private CarService carService;

    @GetMapping()
    public List<GetAllCarResponse> getAll(){
        return carService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody CreateCarRequest createCarRequest){
        this.carService.add(createCarRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.carService.delete(id);
    }
}
