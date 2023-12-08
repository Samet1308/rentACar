package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.customer.CreateCustomerRequest;
import kodlama.io.rentACar.business.requests.customer.UpdateCustomerRequest;
import kodlama.io.rentACar.business.dto.customer.GetAllCustomersResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomersResponse> getAll();
    void add(CreateCustomerRequest createCustomerRequest);
    void delete (int id);
    void update (UpdateCustomerRequest updateCustomerRequest);
}
