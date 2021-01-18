package com.iklimov.lab8;

public class Drops extends Drug {

    public Drops(int title, int amount, String directions, String sideEffects) {
        super(title, amount, directions, sideEffects);
    }

    @Override
    public boolean use() {
        return true;
    }
}
