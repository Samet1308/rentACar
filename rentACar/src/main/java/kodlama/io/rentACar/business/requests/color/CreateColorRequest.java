package kodlama.io.rentACar.business.requests.color;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateColorRequest {

    @NotBlank
    @NotNull
    private String colorName;



}
