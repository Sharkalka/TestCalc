package com.company;

public class StringToArguments {
    private String input;
    private int a;
    private int b;
    private String operator;
    private String[] arguments;

    public StringToArguments(String input) {
        this.input = input;
    }

    public boolean isValid() {
        arguments = input.split(" ");
        if arguments.length != 3 {
            throw new Exception("throws Exception");
        }
    }
}
