package com.pb.mulesoft.av4.paymentservicepb.form;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutenticarForm {
	private String client_id;
	private String api_key;
}
