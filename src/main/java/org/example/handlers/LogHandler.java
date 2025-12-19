package org.example.handlers;

import io.javalin.http.Handler;
public class LogHandler {
    public static Handler logMatchedPath = ctx->{
        String path = ctx.path();
        System.out.println(" before matched path: " + path);
    };
}
