package org.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import org.example.controllers.*;
import org.example.handlers.LogHandler;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        });
        app.before(LogHandler.logMatchedPath);
//        here's the result of before
//        server started: http://localhost:7070
//        before matched path: /
//        before matched path: /index.html
//        before matched path: /api/html
//        before matched path: /api/json
//        before matched path: /api/echo

        app.get("/api/json", JsonController.getResponseJson);
        app.get("/api/html", HtmlController.getResponseHtml);
        app.post("/api/echo", EchoController.echoBody);

        app.start(7070);
        System.out.println("server started: http://localhost:7070");
    }
}