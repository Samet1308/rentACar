package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.model.CreateModelRequest;
import kodlama.io.rentACar.business.requests.model.UpdateModelRequest;
import kodlama.io.rentACar.business.dto.model.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    void add (CreateModelRequest createModelRequest);
    void delete(int id);
    void update(UpdateModelRequest updateModelRequest);
}