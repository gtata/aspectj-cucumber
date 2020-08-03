package org.example;

import org.example.domain.Request;
import org.example.domain.Response;

public class OtherCalculator implements Calculator {
    public Response add(Request request) {
        return new Response(request.getArg1() + request.getArg2());
    }
}
