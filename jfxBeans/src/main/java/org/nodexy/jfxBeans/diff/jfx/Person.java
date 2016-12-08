package org.nodexy.jfxBeans.diff.jfx;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Created by phoenix on 07/12/16.
 */
public class Person {
    private StringProperty firstName;
    private StringProperty lastName;
    private BooleanProperty alive;

    public Person() {
        firstName = new SimpleStringProperty("");
        lastName = new SimpleStringProperty("");
        alive = new SimpleBooleanProperty(false);
    }

    public final String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public final String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public final boolean isAlive() {
        return alive.get();
    }

    public BooleanProperty aliveProperty() {
        return alive;
    }

    public final void setAlive(boolean alive) {
        this.alive.set(alive);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", alive=" + alive +
                '}';
    }
}
