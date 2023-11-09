package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.city.CreateCityRequest;
import kodlama.io.rentACar.business.responses.city.GetAllCityResponse;

import java.util.List;

public interface CityService {
    void add(CreateCityRequest createCityRequest);
    List<GetAllCityResponse> getAll();

    void delete();

    void update();

}
