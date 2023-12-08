package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.RentalCarService;
import kodlama.io.rentACar.business.requests.rentalCar.CreateRentalCarRequest;
import kodlama.io.rentACar.business.requests.rentalCar.UpdateRentalCarRequest;
import kodlama.io.rentACar.business.dto.rentalCar.GetAllRentalCarResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.RentalCarRepository;
import kodlama.io.rentACar.entities.concretes.RentalCar;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RentalCarManager implements RentalCarService {

    private final RentalCarRepository rentalCarRepository;
    private final ModelMapperService modelMapperService;

    public List<GetAllRentalCarResponse> getAll(){
        List<RentalCar> rentalCars = this.rentalCarRepository.findAll();
        List<GetAllRentalCarResponse> rentalCarResponses = rentalCars.stream()
                .map(rentalCar -> this.modelMapperService.forResponse()
                        .map(rentalCar, GetAllRentalCarResponse.class)).collect(Collectors.toList());
        return rentalCarResponses;
    }

    public void add(CreateRentalCarRequest createRentalCarRequest){
        RentalCar rentalCar = this.modelMapperService.forRequest().map(createRentalCarRequest, RentalCar.class);
        this.rentalCarRepository.save(rentalCar);
    }

    @Override
    public void delete(@PathVariable int id){
        this.rentalCarRepository.deleteById(id);
    }

    @Override
    public void update(UpdateRentalCarRequest updateRentalCarRequest) {
        RentalCar rentalCar = this.modelMapperService.forRequest().map(updateRentalCarRequest, RentalCar.class);
        this.rentalCarRepository.save(rentalCar);
    }
}
