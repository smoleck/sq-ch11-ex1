package com.example.sq_ch11_ex1.controllers;

import com.example.sq_ch11_ex1.model.Payment;
import com.example.sq_ch11_ex1.proxy.PaymentsProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentsController {

    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }
    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        System.out.println("Received payment: " + payment.getAmount());
        String requestId = UUID.randomUUID().toString();
        System.out.println("Received payment: " + payment.getAmount());
        System.out.println(requestId);

        return paymentsProxy.createPayment(requestId, payment);

    }
}