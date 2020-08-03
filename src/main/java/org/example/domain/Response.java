package org.example.domain;

public class Response {
    private String message;
    private int result;

    public Response(String message) {
        this.message = message;
    }

    public Response(int result) {
        this.result = result;
    }

    public String getMessage () {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }

    public int getResult () {
        return result;
    }

    public void setResult (int result) {
        this.result = result;
    }
}
