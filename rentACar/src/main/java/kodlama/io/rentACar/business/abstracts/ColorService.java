package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.color.CreateColorRequest;
import kodlama.io.rentACar.business.responses.color.GetAllColorResponse;

import java.util.List;

public interface ColorService {

    List<GetAllColorResponse> getAll();
    void add(CreateColorRequest createColorRequest);

    void delete(int id);
}
