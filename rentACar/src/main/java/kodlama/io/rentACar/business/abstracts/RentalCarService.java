package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.rentalCar.CreateRentalCarRequest;
import kodlama.io.rentACar.business.requests.rentalCar.UpdateRentalCarRequest;
import kodlama.io.rentACar.business.dto.rentalCar.GetAllRentalCarResponse;

import java.util.List;

public interface RentalCarService {

    List<GetAllRentalCarResponse> getAll();

    void add(CreateRentalCarRequest createRentalCarRequest);
    void delete(int id);
    void update (UpdateRentalCarRequest updateRentalCarRequest);
}
