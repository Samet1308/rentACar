package kodlama.io.rentACar.business.responses.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class GetAllPaymentsResponse {

    private int paymentId;

    private double totalPrice;

    private LocalDate paymentDate;


}
