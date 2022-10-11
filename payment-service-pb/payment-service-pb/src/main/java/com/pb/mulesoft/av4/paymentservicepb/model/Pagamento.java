package com.pb.mulesoft.av4.paymentservicepb.model;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import com.pb.mulesoft.av4.paymentservicepb.model.Pagamento;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pagamentos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long order_id;
	
	@NotNull
	@PositiveOrZero
	private BigDecimal total;
	
	@NotBlank
	private String payment_id;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Status payment_status;
	
	@NotBlank
	private String message;

	public Pagamento(@NotNull @PositiveOrZero BigDecimal total, @NotBlank String payment_id, @NotNull Status payment_status, @NotBlank String message) {
		this.total = total;
		this.payment_status = payment_status;
		this.message = message;
		this.payment_id = payment_id;
	}
}