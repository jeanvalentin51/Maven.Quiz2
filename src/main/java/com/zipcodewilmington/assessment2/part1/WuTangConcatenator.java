package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    Integer value = 0;

    public WuTangConcatenator(Integer input) {
        value = input;
    }

    public Boolean isWu() {
        return value%3==0;
    }

    public Boolean isTang() {

        return value%5==0;
    }

    public Boolean isWuTang() {
        return value%15==0;

    }
}
