package com.pb.mulesoft.av4.paymentservicepb.form;

import java.math.BigDecimal;

import com.pb.mulesoft.av4.paymentservicepb.model.Cartao;
import com.pb.mulesoft.av4.paymentservicepb.model.Cliente;
import com.pb.mulesoft.av4.paymentservicepb.model.Moeda;
import com.pb.mulesoft.av4.paymentservicepb.model.TipoDePagamento;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SolicitacaoDePagamentoForm {
	private String seller_id;
	private Cliente customer;
	private TipoDePagamento payment_type;
	private Moeda currency;
	private BigDecimal transaction_amount;
	private Cartao card;

}
