package kodlama.io.rentACar.business.requests.city;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCityRequest {

    @NotNull
    @NotBlank
    private int cityId;

    private String cityName;
}
