package org.example.controllers;
import io.javalin.http.Handler;

public class HtmlController {
    public static Handler getResponseHtml = ctx -> {
        String html = "<html>" +
                "<body style='background-color: black; text-align: center'>" +
                "<h1 style='color: white'>this html is created from endpoint</h1>" +
                "</body>" +
                "</html>";
        ctx.html(html);
    };
}