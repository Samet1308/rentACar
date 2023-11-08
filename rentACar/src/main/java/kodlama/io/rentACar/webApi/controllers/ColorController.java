package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.ColorService;
import kodlama.io.rentACar.business.requests.create.CreateColorRequest;
import kodlama.io.rentACar.business.responses.GetAllColorResponse;
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
    public void add(@Valid @RequestBody CreateColorRequest createColorRequest){
        this.colorService.add(createColorRequest);
    }

}
