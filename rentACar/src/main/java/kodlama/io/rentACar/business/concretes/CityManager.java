package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.CityService;
import kodlama.io.rentACar.business.requests.create.CreateCityRequest;
import kodlama.io.rentACar.business.responses.GetAllCityResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CityRepository;
import kodlama.io.rentACar.entities.concretes.City;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CityManager implements CityService {
    private CityRepository cityRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllCityResponse> getAll(){

        List<City> cities = this.cityRepository.findAll();
        List<GetAllCityResponse> cityResponse= cities.stream()
                .map(city -> this.modelMapperService.forResponse()
                    .map(city,GetAllCityResponse.class)).collect(Collectors.toList());
        return cityResponse;
    }

    @Override
    public void add(CreateCityRequest createCityRequest){
    City city = this.modelMapperService.forRequest().map(createCityRequest, City.class);
    this.cityRepository.save(city);
    }

    @Override
    public void delete() {

    }

    @Override
    public void update() {

    }
}
