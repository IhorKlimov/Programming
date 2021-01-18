package com.iklimov.lab8;


import java.util.Objects;

public abstract class Drug {
    private int title;
    private int amount;
    private String directions;
    private String sideEffects;

    public Drug(int title, int amount, String directions, String sideEffects) {
        this.title = title;
        this.amount = amount;
        this.directions = directions;
        this.sideEffects = sideEffects;
    }

    /**
     * @return result of the use. True - success, false - not.
     */
    public abstract boolean use();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Drug drug = (Drug) o;
        return title == drug.title &&
                amount == drug.amount &&
                Objects.equals(directions, drug.directions) &&
                Objects.equals(sideEffects, drug.sideEffects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, amount, directions, sideEffects);
    }
}



