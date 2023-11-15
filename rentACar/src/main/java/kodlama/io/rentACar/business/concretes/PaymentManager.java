package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.PaymentService;
import kodlama.io.rentACar.business.requests.payment.CreatePaymentRequest;
import kodlama.io.rentACar.business.requests.payment.UpdatePaymentRequest;
import kodlama.io.rentACar.business.responses.payment.GetAllPaymentsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentManager implements PaymentService {
    @Override
    public List<GetAllPaymentsResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreatePaymentRequest createPaymentRequest) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(UpdatePaymentRequest updatePaymentRequest) {

    }
}
