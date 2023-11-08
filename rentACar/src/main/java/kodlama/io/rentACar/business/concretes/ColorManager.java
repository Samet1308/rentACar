package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.ColorService;
import kodlama.io.rentACar.business.requests.create.CreateColorRequest;
import kodlama.io.rentACar.business.responses.GetAllColorResponse;
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

        List<GetAllColorResponse> colorResponse = colors.stream().map(color -> this.modelMapperService.forResponse()
                .map(color, GetAllColorResponse.class)).collect(Collectors.toList());

        return colorResponse;
    }

    @Override
    public void add(CreateColorRequest createColorRequest) {
        Color color = this.modelMapperService.forResponse().map(createColorRequest,Color.class);
        this.colorRepository.save(color);
    }


    @Override
    public void delete(int id){
        this.colorRepository.deleteById(id);
    }
}
