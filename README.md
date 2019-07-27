# zuul-demo

The gateway-service is just proxy service which routes the request to respective service.

URL : http://localhost:8080/product-home/product/electronics hits the product service based on route mapping given in application.properties.

The product-service is the demo service which receives the actual request through zuul proxy.
