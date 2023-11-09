package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.customer.CreateCustomerRequest;
import kodlama.io.rentACar.business.responses.customer.GetAllCustomersResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomersResponse> getAll();
    void add(CreateCustomerRequest createCustomerRequest);
}
