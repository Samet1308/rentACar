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
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_name")
    private String customerName;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_score")
    private Long customerScore = 100L;
}
