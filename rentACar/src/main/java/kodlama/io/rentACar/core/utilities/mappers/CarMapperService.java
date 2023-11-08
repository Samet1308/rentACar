package kodlama.io.rentACar.core.utilities.mappers;

import org.modelmapper.ModelMapper;

public interface CarMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
