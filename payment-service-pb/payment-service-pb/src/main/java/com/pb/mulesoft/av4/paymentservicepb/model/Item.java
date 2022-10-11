package com.pb.mulesoft.av4.paymentservicepb.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
	private String item;
	private BigDecimal value;
	private Long qty;
}
