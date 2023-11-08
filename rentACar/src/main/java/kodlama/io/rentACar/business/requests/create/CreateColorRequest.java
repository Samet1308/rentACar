package kodlama.io.rentACar.business.requests.create;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateColorRequest {

    @NotNull
    private int colorId;

    @NotBlank
    @NotNull
    private String colorName;



}
