package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CurrencyRate;

import reactor.core.publisher.Flux;

@Service
public class CurrencyRatesService {

    private static final List<CurrencyRate> rates = List.of(
            CurrencyRate.builder().currencyName("USD").rate(BigDecimal.ONE).build(),
            CurrencyRate.builder().currencyName("EUR").rate(BigDecimal.valueOf(1.15)).build(),
            CurrencyRate.builder().currencyName("CAD").rate(BigDecimal.valueOf(0.8)).build(),
            CurrencyRate.builder().currencyName("AUD").rate(BigDecimal.valueOf(0.75)).build()
    );

    public Flux<CurrencyRate> getCurrencyRates() {
        return Flux.fromIterable(rates);
    }
}
