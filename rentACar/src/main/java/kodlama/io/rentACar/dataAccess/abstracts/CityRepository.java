package kodlama.io.rentACar.dataAccess.abstracts;

import jakarta.persistence.metamodel.SingularAttribute;
import kodlama.io.rentACar.entities.concretes.City;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CityRepository extends JpaRepository<City,Integer> {

}
