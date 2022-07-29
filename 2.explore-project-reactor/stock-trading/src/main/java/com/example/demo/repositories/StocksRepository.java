package com.example.demo.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Stock;

@Repository
public interface StocksRepository extends ReactiveMongoRepository<Stock, String> {
}
