package com.example.demo.dto;

import java.math.BigDecimal;

import com.example.demo.model.Stock;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockRequest {

    @JsonProperty("stockName")
    private String name;

    private BigDecimal price;

    private String currency;

    public Stock toModel() {
        return Stock.builder()
                .name(this.name)
                .price(this.price)
                .currency(this.currency)
                .build();
    }
}
