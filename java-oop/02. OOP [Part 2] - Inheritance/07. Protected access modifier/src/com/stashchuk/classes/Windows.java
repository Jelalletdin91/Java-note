package com.stashchuk.classes;

public class Windows extends OperatingSystem {

    public Windows(String name, String creator, boolean isOpenSource) {
        this.name = name;
        this.creator = creator;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
