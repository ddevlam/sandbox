package nl.seiferd.vertx.hello;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class HelloWorldApplication extends AbstractVerticle {

    @Override
    public void start() {
        Router router = Router.router(vertx);

        router.route("/:id").handler(ctx -> new HelloController().handle(ctx));

        vertx.createHttpServer().requestHandler(router::accept).listen(8080);
    }
}
