package org.example.domain;

public class Request {
    private int count;
    private int arg1;
    private int arg2;

    public Request(){}

    public Request(int count) {
        this.count = count;
    }

    public Request(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    public int getCount () {
        return count;
    }

    public void setCount (int count) {
        this.count = count;
    }

    public int getArg1 () {
        return arg1;
    }

    public void setArg1 (int arg1) {
        this.arg1 = arg1;
    }

    public int getArg2 () {
        return arg2;
    }

    public void setArg2 (int arg2) {
        this.arg2 = arg2;
    }
}
