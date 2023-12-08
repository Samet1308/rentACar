package kodlama.io.rentACar.business.concretes;

import kodlama.io.rentACar.business.abstracts.PaymentService;
import kodlama.io.rentACar.business.requests.payment.CreatePaymentRequest;
import kodlama.io.rentACar.business.requests.payment.UpdatePaymentRequest;
import kodlama.io.rentACar.business.dto.payment.GetAllPaymentsResponse;
import kodlama.io.rentACar.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.PaymentRepository;
import kodlama.io.rentACar.entities.concretes.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PaymentManager implements PaymentService {

    private final PaymentRepository paymentRepository;
    private final ModelMapperService modelMapperService;

    @Autowired
    public PaymentManager(PaymentRepository paymentRepository, ModelMapperService modelMapperService) {
        this.paymentRepository = paymentRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public List<GetAllPaymentsResponse> getAll() {
        List<Payment> payments = this.paymentRepository.findAll();
        List<GetAllPaymentsResponse> paymentsResponses = payments.stream()
            .map(payment -> this.modelMapperService.forResponse()
            .map(payment,GetAllPaymentsResponse.class))
            .collect(Collectors.toList());
        return paymentsResponses;

    }

    @Override
    public void add(CreatePaymentRequest createPaymentRequest) {
        Payment payment= this.modelMapperService.forRequest().map(createPaymentRequest,Payment.class);
        this.paymentRepository.save(payment);
    }

    @Override
    public void update(UpdatePaymentRequest updatePaymentRequest) {
        Payment payment = this.modelMapperService.forRequest().map(updatePaymentRequest,Payment.class);
        this.paymentRepository.save(payment);
    }
    @Override
    public void delete(int id) {

    }


}
