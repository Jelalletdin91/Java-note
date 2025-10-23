package com.stashchuk.classes;

public class OperatingSystem {
    protected String name;
    protected String creator;
    protected boolean isOpenSource;

    @Override
    public String toString() {
        return "OperatingSystem{name='" + name + ", creator='" + creator + ", isOpenSource=" + isOpenSource + "}";
    }
}
