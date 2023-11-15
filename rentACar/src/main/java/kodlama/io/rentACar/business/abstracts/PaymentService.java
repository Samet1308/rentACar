package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.requests.model.CreateModelRequest;
import kodlama.io.rentACar.business.requests.model.UpdateModelRequest;
import kodlama.io.rentACar.business.requests.payment.CreatePaymentRequest;
import kodlama.io.rentACar.business.requests.payment.UpdatePaymentRequest;
import kodlama.io.rentACar.business.responses.model.GetAllModelsResponse;
import kodlama.io.rentACar.business.responses.payment.GetAllPaymentsResponse;

import java.util.List;

public interface PaymentService {

    List<GetAllPaymentsResponse> getAll();
    void add (CreatePaymentRequest createPaymentRequest);
    void delete(int id);
    void update(UpdatePaymentRequest updatePaymentRequest);
}


