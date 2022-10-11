package com.pb.mulesoft.av4.paymentservicepb.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Autorizacao {

    private String authorization_code;
    private LocalDateTime authorized_at;
    private String reason_code;
    private String reason_message;
}