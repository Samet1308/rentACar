package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.CarService;
import kodlama.io.rentACar.business.requests.car.CreateCarRequest;
import kodlama.io.rentACar.business.requests.car.UpdateCarRequest;
import kodlama.io.rentACar.business.dto.car.GetAllCarResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.CarRepository;
import kodlama.io.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;


@Service // Bu sınıf bir business nesnesidir
@AllArgsConstructor
public class CarManager implements CarService {
    private CarRepository carRepository;

    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllCarResponse> getAll(){

        List<Car> cars = this.carRepository.findAll();

        List<GetAllCarResponse> carResponses = cars.stream()
                .map(car -> this.modelMapperService.forResponse()
                        .map(car, GetAllCarResponse.class)).collect(Collectors.toList());

        return carResponses;
    }
    @Override
    public void add(CreateCarRequest createCarRequest) {

        Car car = this.modelMapperService.forRequest().map(createCarRequest, Car.class);
        this.carRepository.save(car);
    }


    @Override
    public void delete(@PathVariable int id) {
        this.carRepository.deleteById(id);
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
        Car car = this.modelMapperService.forRequest().map(updateCarRequest, Car.class);
        this.carRepository.save(car);
    }
}
