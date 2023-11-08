package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.CustomerService;
import kodlama.io.rentACar.business.requests.create.CreateCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllCustomersResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping
    public List<GetAllCustomersResponse> getAll(){
        return this.customerService.getAll();
    }

    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateCustomerRequest createCustomerRequest){
        this.customerService.add(createCustomerRequest);
    }
}
