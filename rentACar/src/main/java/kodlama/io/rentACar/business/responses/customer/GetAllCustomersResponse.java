package kodlama.io.rentACar.business.responses.customer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomersResponse {

    private int customerId;
    private String customerName;
    private LocalDate registrationDate;
}
