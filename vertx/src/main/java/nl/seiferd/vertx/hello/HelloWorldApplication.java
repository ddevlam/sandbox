package nl.seiferd.vertx.hello;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class HelloWorldApplication {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        Router router = Router.router(vertx);

        router.route("/:id").handler(ctx -> new HelloController().handle(ctx));

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
