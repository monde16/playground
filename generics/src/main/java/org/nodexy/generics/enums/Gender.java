package org.nodexy.generics.enums;

/**
 * Created by phoenix on 3/20/17.
 */
public enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    OTHER("NA");

    private String displayName;
    private Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() { return displayName; }
}
