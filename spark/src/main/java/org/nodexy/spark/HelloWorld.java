package org.nodexy.spark;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        port(4567);
        get("/hello", (request, response) -> "<h2>Hello, world!</h2>");
        get("/private", (req,res)->{
            res.status(401);
            return "<h3>Go away!</h3>";
        });
    }
}
