package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.rentalCar.CreateRentalCarRequest;
import kodlama.io.rentACar.business.responses.rentalCar.GetAllRentalCarResponse;

import java.util.List;

public interface RentalCarService {

    List<GetAllRentalCarResponse> getAll();

    void add(CreateRentalCarRequest createRentalCarRequest);
}
