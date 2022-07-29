#

```sh
curl --location --request POST 'http://localhost:8080/stocks' \
--header 'Content-Type: application/json' \
--data-raw '{
    "stockName" :"Globomantics",
    "price": 1000,
    "currency": "USD"
}'
```

Response:

```json
{
    "id": "62e3967963ce3e4363296292",
    "price": 1000,
    "currency": "USD",
    "stockName": "Globomantics"
}
```

GET -> `http://localhost:8080/stocks`

GET -> `http://localhost:8080/stocks/62e3967963ce3e4363296292`