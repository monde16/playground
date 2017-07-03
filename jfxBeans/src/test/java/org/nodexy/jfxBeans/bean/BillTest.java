package org.nodexy.jfxBeans.bean;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by phoenix on 07/12/16.
 */
public class BillTest {
    @Test
    public void test() {
        Bill bill = new Bill();
        assertEquals(0,bill.getAmountDue(),0);
        bill.setAmountDue(127.50);
        assertEquals(127.5,bill.getAmountDue(),0);
        System.out.println("*******************************");
        System.out.println("bill = "+bill);
        System.out.println("bill.amountProp = "+bill.amountDueProperty());
        System.out.println("amountProp.getBean = "+bill.amountDueProperty().getBean());
        System.out.println("amountProp.name = "+bill.amountDueProperty().getName());
        System.out.println("*******************************");
    }
    @Test public void testListener() {
        Bill bill = new Bill();
        System.out.println("bill = "+bill);
        System.out.println("Adding value change listener...");
        bill.amountDueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("bill has change: "+oldValue+"-->"+newValue);
            }
        });
        System.out.println("Changing bill's amount due...");
        bill.setAmountDue(320);
        System.out.println("bill = "+bill);
        System.out.println("Setting bill amount to same value...");
        bill.setAmountDue(320);
        System.out.println("bill = "+bill);
    }
    @Test public void testBinding_fluentApi() {
        IntegerProperty num1 = new SimpleIntegerProperty();
        IntegerProperty num2 = new SimpleIntegerProperty();


    }
    @Test public void testBinding_BindingsApi() {

    }
}
