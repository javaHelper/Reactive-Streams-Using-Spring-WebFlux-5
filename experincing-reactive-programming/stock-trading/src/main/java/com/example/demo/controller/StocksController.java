package com.example.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Stock;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/stocks")
public class StocksController {

    @GetMapping("/{id}")
    public Mono<Stock> getOneStock(@PathVariable String id) {
        return Mono.just(Stock.builder()
                .name("stock-" + id)
                .build());
    }

    @GetMapping
    public Flux<Stock> getAllStocks() {
        return Flux.range(1, 5)
                .map(count -> Stock.builder()
                        .name("stock-" + count)
                        .build());
    }
}