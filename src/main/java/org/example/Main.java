package org.example;

import io.javalin.Javalin;

//import io.javalin.javalin
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.start(7070);
        System.out.println("server started: http://localhost:7070");
    }
}