package com.pb.mulesoft.av4.paymentservicepb.http;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pb.mulesoft.av4.paymentservicepb.dto.AutenticarDto;
import com.pb.mulesoft.av4.paymentservicepb.form.AutenticarForm;
import com.pb.mulesoft.av4.paymentservicepb.form.SolicitacaoDePagamentoForm;
import com.pb.mulesoft.av4.paymentservicepb.dto.SolicitacaoDePagamentoDto;

@FeignClient(url = "https://pb-getway-payment.herokuapp.com/v1", name = "PB-Bank")
public interface PedidoClient {

	@RequestMapping(method = RequestMethod.POST, value = "/payments/credit-card")
	public SolicitacaoDePagamentoDto solicitarPagamento(@RequestHeader(value = "Authorization", required = true) String authorizationHeader, @RequestBody @Valid SolicitacaoDePagamentoForm form);

    @RequestMapping(method = RequestMethod.POST, value = "/auth")
    public AutenticarDto autenticar(@RequestBody @Valid AutenticarForm form);

}