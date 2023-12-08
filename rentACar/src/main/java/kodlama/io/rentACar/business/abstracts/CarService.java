package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.requests.car.UpdateCarRequest;
import kodlama.io.rentACar.business.dto.car.GetAllCarResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarResponse> getAll();
    void add(CreateCarRequest createCarRequest);
    void delete(int id);
    void update (UpdateCarRequest updateCarRequest);
}
