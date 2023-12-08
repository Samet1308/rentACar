package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private int paymentId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "total_price")
    private double totalPrice;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_date")
    private LocalDate paymentDate;
}
