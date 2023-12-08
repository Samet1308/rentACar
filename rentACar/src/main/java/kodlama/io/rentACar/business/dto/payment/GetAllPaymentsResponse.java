package kodlama.io.rentACar.business.dto.payment;

import jakarta.transaction.Transactional;
import lombok.Data;

import java.time.LocalDate;


@Data
@Transactional
public class GetAllPaymentsResponse {

    private final int paymentId;

    private final double totalPrice;

    private final LocalDate paymentDate;




    public GetAllPaymentsResponse(int paymentId, double totalPrice, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.totalPrice = totalPrice;
        this.paymentDate = paymentDate;
    }
}
