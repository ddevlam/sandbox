package nl.seiferd.vertx.hello;

import io.vertx.core.Handler;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.RoutingContext;

public class HelloController implements Handler<RoutingContext> {

    @Override
    public void handle(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
        HttpServerResponse response = routingContext.response();
        response.end("Hi there " + id);
    }
}
