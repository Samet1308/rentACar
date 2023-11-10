package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "rental_cars")
public class RentalCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_car_id")
    private int rentalCarId;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "rented_kilometer")
    private Long rentedKilometer;

    @Column(name = "delivered_kilometer")
    private Long deliveredKilometer;

}
