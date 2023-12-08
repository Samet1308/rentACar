package kodlama.io.rentACar.business.dto.color;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllColorResponse {

    @NotBlank
    @NotNull
    private int colorId;

    @NotBlank
    @NotNull
    private String colorName;

}
