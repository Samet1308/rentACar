package kodlama.io.rentACar.business.dto.city;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCityResponse {
    private int cityId;
    private String cityName;


}
