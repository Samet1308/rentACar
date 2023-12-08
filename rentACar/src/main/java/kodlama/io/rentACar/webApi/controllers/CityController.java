package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.CityService;
import kodlama.io.rentACar.business.requests.city.CreateCityRequest;
import kodlama.io.rentACar.business.requests.city.UpdateCityRequest;
import kodlama.io.rentACar.business.dto.city.GetAllCityResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/cities")
@RestController
@AllArgsConstructor
public class CityController {
    private CityService cityService;


    @GetMapping()
    public List<GetAllCityResponse> getAll(){
        return cityService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateCityRequest createCityRequest){
        this.cityService.add(createCityRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.cityService.delete(id);
    }

    @PutMapping()
    public void update(UpdateCityRequest updateCityRequest){
        this.cityService.update(updateCityRequest);
    }
}

