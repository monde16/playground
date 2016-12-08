package org.nodexy.jfxBeans.diff.java;

/**
 * Created by phoenix on 07/12/16.
 */
public class Person {
    /**
     * A Person object
     * with properties: firstName, lastName, alive
     */
    private String firstName;
    private String lastName;
    private boolean alive;
    public Person() {
        firstName="";
        lastName="";
        alive=false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", alive=" + alive +
                '}';
    }
}
