package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.create.CreateModelRequest;
import kodlama.io.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {

    List<GetAllModelsResponse> getAll();
    void add (CreateModelRequest createModelRequest);

    void delete(int id);
}