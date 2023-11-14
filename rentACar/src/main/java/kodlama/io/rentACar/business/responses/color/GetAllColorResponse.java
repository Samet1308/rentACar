package kodlama.io.rentACar.business.responses.color;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import kodlama.io.rentACar.entities.concretes.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

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
