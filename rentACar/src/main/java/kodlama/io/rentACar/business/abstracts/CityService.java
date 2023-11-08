package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.create.CreateCityRequest;
import kodlama.io.rentACar.business.responses.GetAllCityResponse;

import java.util.List;

public interface CityService {
    void add(CreateCityRequest createCityRequest);
    List<GetAllCityResponse> getAll();

    void delete();

    void update();

}
