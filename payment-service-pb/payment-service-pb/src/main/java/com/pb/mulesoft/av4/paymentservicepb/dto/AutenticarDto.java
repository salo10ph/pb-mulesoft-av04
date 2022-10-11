package com.pb.mulesoft.av4.paymentservicepb.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AutenticarDto {
	private String access_token;
	private String token_type;
	private Long expires_in;

}