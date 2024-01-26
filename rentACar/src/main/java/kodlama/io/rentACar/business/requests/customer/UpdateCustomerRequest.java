package kodlama.io.rentACar.business.requests.customer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdateCustomerRequest {

    @NotNull
    @NotBlank
    private int customerId;

    private String customerName;

    private LocalDateTime registrationDate= LocalDateTime.now();
}
