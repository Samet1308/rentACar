package kodlama.io.rentACar.webApi.controllers;

import jakarta.validation.Valid;
import kodlama.io.rentACar.business.abstracts.PaymentService;
import kodlama.io.rentACar.business.requests.payment.CreatePaymentRequest;
import kodlama.io.rentACar.business.dto.payment.GetAllPaymentsResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
   private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public List<GetAllPaymentsResponse> getAll(){
        return paymentService.getAll();
    }

    @PostMapping
    public void add( @RequestBody @Valid CreatePaymentRequest createPaymentRequest){
        this.paymentService.add(createPaymentRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.paymentService.delete(id);
    }

}

