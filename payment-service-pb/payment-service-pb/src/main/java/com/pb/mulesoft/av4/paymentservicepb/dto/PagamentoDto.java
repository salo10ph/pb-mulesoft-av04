package com.pb.mulesoft.av4.paymentservicepb.dto;

import java.math.BigDecimal;

import com.pb.mulesoft.av4.paymentservicepb.model.Status;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoDto {
	private Long order_id;
	private BigDecimal total;
	private String payment_id;
	private Status payment_status;
	private String message;

}