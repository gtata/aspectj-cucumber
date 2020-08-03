package org.example;

import org.example.domain.Request;
import org.example.service.HelloWorldService;

public class HelloWorld {

    /**
     * Test method: run time discovery can be intercepted
     *
     * @param args
     */
    public static void main(String[] args) {
        HelloWorldService service = new HelloWorldService();
        service.sayHello(new Request(2));
    }
}
