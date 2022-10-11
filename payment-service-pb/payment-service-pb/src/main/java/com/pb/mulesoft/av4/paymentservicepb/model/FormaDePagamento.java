package com.pb.mulesoft.av4.paymentservicepb.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FormaDePagamento {
	
	private String numeroDoCartao;
	private String nomeNoCartao;
	private String codigoDeSeguranca;
	private int mesDeExpiracao;
	private int anoDeExpiracao;
	private Marca marcaDoCartao;

}
