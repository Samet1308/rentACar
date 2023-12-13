package kodlama.io.rentACar.business.requests.car;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

    @NotNull
    @NotBlank
    private int modelId;

    @NotNull
    @NotBlank
    private  String plate;

    @NotNull
    @NotBlank
    private double dailyPrice;

    @NotNull
    @NotBlank
    private int modelYear;

    @NotNull
    @NotBlank
    private Boolean stateId;


    @NotNull
    @NotBlank
    private int colorId;



}
