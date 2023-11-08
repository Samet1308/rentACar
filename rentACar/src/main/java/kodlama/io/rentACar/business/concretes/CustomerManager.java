package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.CustomerService;
import kodlama.io.rentACar.business.requests.create.CreateCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllCustomersResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CustomerRepository;
import kodlama.io.rentACar.entities.concretes.Customer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerManager implements CustomerService {

    private ModelMapperService modelMapperService;
    private CustomerRepository customerRepository;

    @Override
    public List<GetAllCustomersResponse> getAll() {
        List<Customer> customers = this.customerRepository.findAll();
        List<GetAllCustomersResponse> customersResponses = customers.stream()
                .map(customer -> this.modelMapperService.forResponse()
                        .map(customer,GetAllCustomersResponse.class)).collect(Collectors.toList());

        return customersResponses;
    }
    @Override
    public void add(CreateCustomerRequest createCustomerRequest){
        Customer customer = this.modelMapperService.forResponse().map(createCustomerRequest, Customer.class);
        this.customerRepository.save(customer);
    }
}
