package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cars")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;

    @Column(name = "plate", unique = true)
    private  String plate;

    @Column(name = "daily_price")
    private double dailyPrice;

    @Column(name = "model_year")
    private int modelYear;

    @Column(name = "state_id")
    private Boolean stateId;

    @Column(name = "state_name")
    private String stateName;


    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name= "color_id")
    private Color color;
}
