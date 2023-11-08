package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.create.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.update.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandsResponse;

import java.util.List;
public interface BrandService {

    GetByIdBrandsResponse getId(int id);
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);

    void delete(int id);

    void update(UpdateBrandRequest updateBrandRequest);
}
