package org.example;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import org.example.controllers.*;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        });

        app.get("/api/json", JsonController.getResponseJson);
        app.get("/api/html", HtmlController.getResponseHtml);

        app.start(7070);
        System.out.println("server started: http://localhost:7070");
    }
}