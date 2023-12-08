package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.brand.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brand.UpdateBrandRequest;
import kodlama.io.rentACar.business.dto.brand.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dto.brand.GetByIdBrandsResponse;

import java.util.List;
public interface BrandService {

    GetByIdBrandsResponse getId(int id);
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);

    void delete(int id);

    void update(UpdateBrandRequest updateBrandRequest);
}
