package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.CustomerService;
import kodlama.io.rentACar.business.abstracts.RentalCarService;
import kodlama.io.rentACar.business.requests.customer.CreateCustomerRequest;
import kodlama.io.rentACar.business.requests.rentalCar.CreateRentalCarRequest;
import kodlama.io.rentACar.business.responses.customer.GetAllCustomersResponse;
import kodlama.io.rentACar.business.responses.rentalCar.GetAllRentalCarResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
}
