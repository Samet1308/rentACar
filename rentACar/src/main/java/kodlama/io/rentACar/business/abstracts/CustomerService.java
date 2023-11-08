package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.create.CreateCustomerRequest;
import kodlama.io.rentACar.business.responses.GetAllCustomersResponse;

import java.util.List;

public interface CustomerService {
    List<GetAllCustomersResponse> getAll();
    void add(CreateCustomerRequest createCustomerRequest);
}
