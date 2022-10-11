package com.pb.mulesoft.av4.paymentservicepb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {

	private TipoDeDocumento document_type;
	private String document_number;
	
}
