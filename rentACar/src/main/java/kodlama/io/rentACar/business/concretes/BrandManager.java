package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.brand.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.brand.UpdateBrandRequest;
import kodlama.io.rentACar.business.dto.brand.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dto.brand.GetByIdBrandsResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Service // Bu sınıf bir buinnes nesnesidir
@AllArgsConstructor
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;


    @Override
    public GetByIdBrandsResponse getId(int id) {
        return null;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {

        List<Brand> brands = this.brandRepository.findAll();

        List<GetAllBrandsResponse> brandsResponse = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandsResponse.class)).collect(Collectors.toList());

        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {

        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
        //Yeni brand objesi çağırıp bu objenin değişkenleri ile updateBrandRequest
        // nesnesinin değişkenlerini atama işlemi gerçekleşiyor.
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest){

        //Yeni brand objesi çağırıp bu objenin değişkenleri ile updateBrandRequest
        // nesnesinin değişkenlerini atama işlemi gerçekleşiyor.
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        this.brandRepository.save(brand);

    }
    @Override
    public void delete(@PathVariable int id) {
        this.brandRepository.deleteById(id);
    }
}
