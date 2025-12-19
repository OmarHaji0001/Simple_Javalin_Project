package org.example.controllers;

import io.javalin.http.Handler;

public class EchoController {
    public static Handler echoBody = ctx -> {
        String body = ctx.body();
        ctx.result(body);
    };
}
