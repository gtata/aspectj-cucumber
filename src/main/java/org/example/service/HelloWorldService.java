package org.example.service;

import org.example.annotation.Log;
import org.example.domain.Request;
import org.example.domain.Response;

public class HelloWorldService {

    @Log
    public Response sayHello(Request request) {
        for (int i = 1; i <= request.getCount(); i++) {
            System.out.println(i + ") Hello World from AspectJ!!");
        }
        return new Response("Successfully said hello " + request.getCount() + " time(s)");
    }
}
