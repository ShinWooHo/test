package com.example.finalprotest.user.dto;

public enum ResCode {

    SUCCESS(0);

    private final int value;
    ResCode(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
