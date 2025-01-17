package com.platzi.util.payments;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class PaymentProcessorTest {

    // Estos son objetos comunes que se necesitan para varios tests.
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    // Preparacion de los objetos.
    // Este metodo se ejecuta antes de cada test, para inicializar los objetos en comun.
    @BeforeEach // En el curso se utiliza @Before pero ya esta @Deprecated.
    public void setup() { // Este nombre es que se le da comunmente al metodo que inicializa los objetos en comun de los tests.
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }


    @Test
    @DisplayName("Comprobar cuando un pago es correcto: Retorna true")
    void makePaymentIsCorrect() {
        //Retornar un valor fijo para testear el metodo.
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        // Comprobar el resultado.
        assertTrue(paymentProcessor.makePayment(1000));
    }

    @Test
    @DisplayName("Comprobar cuando un pago es incorrecto: Retorna false")
    void makePaymentIsWrong() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        // Comprobar el resultado.
        assertFalse(paymentProcessor.makePayment(1000));
    }
}