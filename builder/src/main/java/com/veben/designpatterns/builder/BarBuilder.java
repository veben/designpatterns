package com.veben.designpatterns.builder;

public class BarBuilder {
    
    private String name;
    private int size;
    private Address address;
    private int numberOfBeers;
    private boolean hasHappyHour;
    private boolean isPopular;

    public BarBuilder name(String name) {
        this.name = name;
        return this;
    }

    public BarBuilder size(int size) {
        this.size = size;
        return this;
    }

    public BarBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public BarBuilder numberOfBeers(int numberOfBeers) {
        this.numberOfBeers = numberOfBeers;
        return this;
    }

    public BarBuilder hasHappyHour(boolean hasHappyHour) {
        this.hasHappyHour = hasHappyHour;
        return this;
    }

    public BarBuilder isPopular(boolean isPopular) {
        this.isPopular = isPopular;
        return this;
    }

    public Bar build() {
        return new Bar(name, size, numberOfBeers, hasHappyHour, isPopular, address);
    }
}