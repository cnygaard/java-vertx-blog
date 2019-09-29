import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;

public class helloworld {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();

        HttpServer server = vertx.createHttpServer();
//        Router router = Router.router(vertx);

        server.requestHandler(request -> {
            HttpServerResponse response = request.response();
            response.putHeader("content-type", "text-plain");
            response.end("Hello World!");
        });
        server.listen(8080);
    }
}