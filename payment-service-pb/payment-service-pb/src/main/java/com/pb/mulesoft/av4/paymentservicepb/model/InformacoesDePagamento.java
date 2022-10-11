package com.pb.mulesoft.av4.paymentservicepb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InformacoesDePagamento {
	
	private String card_number;
	private String cardholder_name;
	private String security_code;
	private Marca brand;
	private int expiration_month;
	private int expiration_year;
	

}