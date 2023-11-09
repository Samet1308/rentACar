package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.responses.car.GetAllCarResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarResponse> getAll();

    void add(CreateCarRequest createCarRequest);
    void delete(int id);
}
