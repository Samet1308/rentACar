package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.ColorService;
import kodlama.io.rentACar.business.requests.color.CreateColorRequest;
import kodlama.io.rentACar.business.requests.color.UpdateColorRequest;
import kodlama.io.rentACar.business.dto.color.GetAllColorResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colors")
@AllArgsConstructor
public class ColorController {
    private ColorService colorService;

    @GetMapping()
    public List<GetAllColorResponse> getAll(){
        return colorService.getAll();
    }

    @PostMapping()
    public void add(@RequestBody @Valid CreateColorRequest createColorRequest){
        this.colorService.add(createColorRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.colorService.delete(id);
    }

    @PutMapping()
    public void update(@RequestBody UpdateColorRequest updateColorRequest){
        this.colorService.update(updateColorRequest);
    }

}
