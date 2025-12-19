package org.example.handlers;

import io.javalin.http.Handler;

public class SessionHandler {
    public static Handler logSessionID = ctx->{

        try {
            String sessionID = ctx.req().getSession().getId();
            System.out.println("after session ID: " + sessionID);
        }
        catch(IllegalStateException e) {}
    };
}
