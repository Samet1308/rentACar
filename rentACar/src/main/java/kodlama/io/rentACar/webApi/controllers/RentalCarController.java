package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.RentalCarService;
import kodlama.io.rentACar.business.requests.rentalCar.CreateRentalCarRequest;
import kodlama.io.rentACar.business.requests.rentalCar.UpdateRentalCarRequest;
import kodlama.io.rentACar.business.dto.rentalCar.GetAllRentalCarResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class RentalCarController {

    private RentalCarService rentalCarService;

    @GetMapping
    public List<GetAllRentalCarResponse> getAll(){
        return this.rentalCarService.getAll();
    }

    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateRentalCarRequest rentalCarRequest){
        this.rentalCarService.add(rentalCarRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.rentalCarService.delete(id);
    }

    @PutMapping()
    public void update(@RequestBody UpdateRentalCarRequest updateRentalCarRequest){
        this.rentalCarService.update(updateRentalCarRequest);
    }
}
