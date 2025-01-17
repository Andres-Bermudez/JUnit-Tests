package com.platzi.util.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
