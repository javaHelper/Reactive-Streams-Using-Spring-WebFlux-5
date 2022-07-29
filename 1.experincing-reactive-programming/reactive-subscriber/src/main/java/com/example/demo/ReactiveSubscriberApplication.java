package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.client.ReactiveStocksSubscriber;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class ReactiveSubscriberApplication {
	
	@Autowired
	private ReactiveStocksSubscriber reactiveStocksSubscriber;

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSubscriberApplication.class, args);
	}
	
	@PostConstruct
	public void subscribeToStockTradingApp() {
		reactiveStocksSubscriber.getOneStock("1")
			.block();
		
		log.info("**************************************");

		reactiveStocksSubscriber.getAllStocks()
				.blockLast();
	}

}
