package com.example.sq_ch11_ex1.proxy;

import com.example.sq_ch11_ex1.model.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments", url = "${name.service.url}")
public interface PaymentsProxy {
//    @PostMapping("/payment")
//    Payment createPayment(
//            @RequestHeader String requestId,
//            @RequestBody Payment payment);

    @PostMapping("/payment")
    Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment);
}