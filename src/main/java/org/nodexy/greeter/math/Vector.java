package org.nodexy.greeter.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by phoenix on 11/1/16.
 */
public class Vector <Number> {
    private List<Number> elements;
    private int dim;
    public Vector(int dim) {
        elements = new ArrayList<>(dim);
        this.dim = dim;
    }
    public Vector(Number ... elements) {
        this.elements = Arrays.asList(elements);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        elements.stream().forEach(it->sb.append(it + " "));
        return sb.append("]").toString();
    }

    public int getDim() {
        return dim;
    }

    public void setDim(int dim) {
        this.dim = dim;
    }
}
