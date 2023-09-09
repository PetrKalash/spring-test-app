package ru.petrkalash.springtestapp.test1;

public class TestBean {
    private String name;

    public TestBean() {
        this("Unknown");
    }

    public TestBean(String name) {
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
}
