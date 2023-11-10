package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.entities.concretes.RentalCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalCarRepository extends JpaRepository<RentalCar,Integer> {
}
