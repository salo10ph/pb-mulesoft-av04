package com.pb.mulesoft.av4.paymentservicepb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pb.mulesoft.av4.paymentservicepb.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{
	
}
