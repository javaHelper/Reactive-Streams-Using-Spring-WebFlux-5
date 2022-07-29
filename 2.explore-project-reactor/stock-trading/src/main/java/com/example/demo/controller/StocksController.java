package com.example.demo.controller;
import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StockRequest;
import com.example.demo.dto.StockResponse;
import com.example.demo.service.StocksService;

import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@RestController
@RequestMapping("/stocks")
public class StocksController {

    private StocksService stocksService;

    @GetMapping("/{id}")
    public Mono<StockResponse> getOneStock(@PathVariable String id) {
        return stocksService.getOneStock(id);
    }

    @GetMapping
    public Flux<StockResponse> getAllStocks(@RequestParam(required = false, defaultValue = "0") 
            BigDecimal priceGreaterThan) {
        return stocksService.getAllStocks(priceGreaterThan);
    }

    @PostMapping
    public Mono<StockResponse> createStock(@RequestBody StockRequest stock) {
        return stocksService.createStock(stock);
    }

}