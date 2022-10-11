package com.pb.mulesoft.av4.paymentservicepb.dto;

import java.math.BigDecimal;

import com.pb.mulesoft.av4.paymentservicepb.model.Autorizacao;
import com.pb.mulesoft.av4.paymentservicepb.model.Status;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SolicitacaoDePagamentoDto {
	
    private String payment_id;
	private BigDecimal transaction_amount;
    private Status status;
    private Autorizacao authorization;
	
}