package kodlama.io.rentACar.business.responses;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarResponse {
    @Id
    @NotNull
    @NotBlank
    private int id;

    @NotNull
    @NotBlank
    private  String brandName;

    @NotNull
    @NotBlank
    private String modelName;

    @NotNull
    @NotBlank
    private int modelId;

    @NotNull
    @NotBlank
    private int modelYear;

    @NotNull
    @NotBlank
    private  String plate;

    @NotNull
    @NotBlank
    private double dailyPrice;

    @NotNull
    @NotBlank
    private int state;

    @NotNull
    @NotBlank
    private int colorId;
}
