package by.bntu.fitr.povt.noname.lab11.model.entity;

import java.util.Arrays;

public class Vector {
    private int[] elements;

    public Vector(int... elements) {
        this.elements = elements;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        if (elements != null){
            this.elements = elements;
        }
    }

    public int size() {
        return elements.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Arrays.equals(elements, vector.elements);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(elements);
    }

    @Override
    public String toString() {
        return "Vector{" +
                "elements=" + Arrays.toString(elements) +
                '}';
    }
}
