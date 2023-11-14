package kodlama.io.rentACar.business.requests.color;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateColorRequest {

    @NotNull
    private int colorId;

    private String colorName;
}
