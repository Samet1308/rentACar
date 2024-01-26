package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.ColorService;
import kodlama.io.rentACar.business.requests.color.CreateColorRequest;
import kodlama.io.rentACar.business.requests.color.UpdateColorRequest;
import kodlama.io.rentACar.business.dto.color.GetAllColorResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.ColorRepository;
import kodlama.io.rentACar.entities.concretes.Color;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ColorManager implements ColorService {

    private ColorRepository colorRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllColorResponse> getAll() {
        List<Color> colors = this.colorRepository.findAll();
        List<GetAllColorResponse> colorsResponse = colors.stream()
                .map(color -> this.modelMapperService.forResponse()
                        .map(color,GetAllColorResponse.class)).collect(Collectors.toList());
        return colorsResponse;
    }

    @Override
    public void add(CreateColorRequest createColorRequest) {
        Color color = this.modelMapperService.forRequest().map(createColorRequest, Color.class);
        this.colorRepository.save(color);
    }


    @Override
    public void delete(int id){
        this.colorRepository.deleteById(id);
    }
    @Override
    public void update(UpdateColorRequest updateColorRequest){
        Color color = this.modelMapperService.forRequest().map(updateColorRequest, Color.class);
        this.colorRepository.save(color);
    }
}
