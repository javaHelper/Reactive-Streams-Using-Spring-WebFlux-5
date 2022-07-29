# Experincing with Reactive Program

```sh
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.0)

2022-07-29 12:46:56.981  INFO 16118 --- [           main] c.e.demo.ReactiveSubscriberApplication   : Starting ReactiveSubscriberApplication using Java 11.0.13 on Prateeks-MacBook-Pro.local with PID 16118 (/Users/prats/Documents/workspace/reactive-subscriber/target/classes started by prateekashtikar in /Users/prats/Documents/workspace/reactive-subscriber)
2022-07-29 12:46:56.983  INFO 16118 --- [           main] c.e.demo.ReactiveSubscriberApplication   : No active profile set, falling back to 1 default profile: "default"
2022-07-29 12:46:58.299  INFO 16118 --- [           main] c.e.d.client.ReactiveStocksSubscriber    : On Subscribe
2022-07-29 12:46:59.045  INFO 16118 --- [ctor-http-nio-2] c.e.d.client.ReactiveStocksSubscriber    : On Next stock: Stock(name=stock-1)
2022-07-29 12:46:59.049  INFO 16118 --- [ctor-http-nio-2] c.e.d.client.ReactiveStocksSubscriber    : On Complete
2022-07-29 12:46:59.049  INFO 16118 --- [           main] c.e.demo.ReactiveSubscriberApplication   : **************************************
2022-07-29 12:46:59.051  INFO 16118 --- [           main] c.e.d.client.ReactiveStocksSubscriber    : On Subscribe
2022-07-29 12:46:59.088  INFO 16118 --- [ctor-http-nio-3] c.e.d.client.ReactiveStocksSubscriber    : On Next stock: Stock(name=stock-1)
2022-07-29 12:46:59.089  INFO 16118 --- [ctor-http-nio-3] c.e.d.client.ReactiveStocksSubscriber    : On Next stock: Stock(name=stock-2)
2022-07-29 12:46:59.089  INFO 16118 --- [ctor-http-nio-3] c.e.d.client.ReactiveStocksSubscriber    : On Next stock: Stock(name=stock-3)
2022-07-29 12:46:59.089  INFO 16118 --- [ctor-http-nio-3] c.e.d.client.ReactiveStocksSubscriber    : On Next stock: Stock(name=stock-4)
2022-07-29 12:46:59.089  INFO 16118 --- [ctor-http-nio-3] c.e.d.client.ReactiveStocksSubscriber    : On Next stock: Stock(name=stock-5)
2022-07-29 12:46:59.089  INFO 16118 --- [ctor-http-nio-3] c.e.d.client.ReactiveStocksSubscriber    : On Complete
2022-07-29 12:46:59.467  INFO 16118 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 9999
2022-07-29 12:46:59.483  INFO 16118 --- [           main] c.e.demo.ReactiveSubscriberApplication   : Started ReactiveSubscriberApplication in 3.059 seconds (JVM running for 3.925)
```
