package kodlama.io.rentACar.business.requests.payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletePaymentRequest {

    private double totalPrice;


}
