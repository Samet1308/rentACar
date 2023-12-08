package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.city.CreateCityRequest;
import kodlama.io.rentACar.business.requests.city.UpdateCityRequest;
import kodlama.io.rentACar.business.dto.city.GetAllCityResponse;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CityService {
    void add(CreateCityRequest createCityRequest);
    List<GetAllCityResponse> getAll();
    void delete(@PathVariable int id);
    void update(UpdateCityRequest updateCityRequest);

}
