package org.nodexy.jfxBeans.bean;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Created by phoenix on 07/12/16.
 */
public class Bill {
    private DoubleProperty amountDue = new SimpleDoubleProperty();

    public final double getAmountDue() { return amountDue.get(); }
    public final void setAmountDue(double value) { amountDue.set(value); }
    public DoubleProperty amountDueProperty() { return amountDue; }

    @Override
    public String toString() {
        return "Bill{" +
                "amountDue=" + amountDue +
                '}';
    }
}
