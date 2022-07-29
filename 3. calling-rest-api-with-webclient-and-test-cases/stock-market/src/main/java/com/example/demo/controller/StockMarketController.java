package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CurrencyRate;
import com.example.demo.dto.StockPublishRequest;
import com.example.demo.dto.StockPublishResponse;
import com.example.demo.service.CurrencyRatesService;
import com.example.demo.service.StockPublishingService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
@Slf4j
public class StockMarketController {

    private CurrencyRatesService currencyRatesService;
    private StockPublishingService stockPublishingService;

    @GetMapping("/currencyRates")
    public Flux<CurrencyRate> getCurrencyRates(
        @RequestHeader(value = "X-Trace-Id", required = false) 
                                                        String traceId) {
        log.info("Get Currency Rates API called with Trace Id: {}", traceId);
        return currencyRatesService.getCurrencyRates();
    }

    @PostMapping("/stocks/publish")
    public Mono<StockPublishResponse> publishStock(@RequestBody StockPublishRequest request, 
                                                    @RequestHeader(value = "X-Trace-Id", required = false) String traceId) {
        log.info("Publish Stock API called with Trace Id: {}", traceId);
        return stockPublishingService.publishStock(request);
    }
}
