package kodlama.io.rentACar.business.dto.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomersResponse {

    private int customerId;
    private String customerName;
    private LocalDateTime registrationDate;
    private Long customerScore = 100L;
}
