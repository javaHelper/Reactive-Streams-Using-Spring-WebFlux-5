#

# Create Stock

```sh
curl --location --request POST 'http://localhost:8080/stocks' \
--header 'Content-Type: application/json' \
--data-raw '{
    "stockName" :"Globomantics",
    "price": 1000,
    "currency": "USD"
}'
```

GET -> `http://localhost:8080/stocks/62e3a44b686f1d35aef66b4f?currency=EUR`
