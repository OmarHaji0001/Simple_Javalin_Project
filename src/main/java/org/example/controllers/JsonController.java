package org.example.controllers;

import java.util.HashMap;
import java.util.Map;
import io.javalin.http.Handler;

public class JsonController {
    public static Handler getResponseJson = ctx -> {
        Map<String, Object> data = new HashMap<>();
        data.put("message", "Hello, Json endpoint");
        ctx.json(data);
    };
}