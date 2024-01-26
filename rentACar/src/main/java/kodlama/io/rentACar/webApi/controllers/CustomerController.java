package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.CustomerService;
import kodlama.io.rentACar.business.requests.customer.CreateCustomerRequest;
import kodlama.io.rentACar.business.requests.customer.UpdateCustomerRequest;
import kodlama.io.rentACar.business.dto.customer.GetAllCustomersResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
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

    public void delete(@PathVariable int id){
        this.customerService.delete(id);
    }

    public void update (@RequestBody UpdateCustomerRequest updateCustomerRequest){
        this.customerService.update(updateCustomerRequest);
    }
}
