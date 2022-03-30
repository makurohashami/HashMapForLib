package com.company;

import java.util.Objects;

public class Identifier {
    private final int ID;

    public Identifier(int ID) {
        this.ID = ID;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identifier)) return false;
        Identifier that = (Identifier) o;
        return getID() == that.getID();
    }

    public int hashCode() {
        return Objects.hash(getID());
    }

    public String toString() {
        return "ID: " + ID;
    }

    public int getID() {
        return ID;
    }
}
