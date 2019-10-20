package com.veben.designpatterns.builder;

public class Bar {
    // Make fields final
    private final String name;
    private final int size;
    private final int numberOfBeers;
    private final boolean hasHappyHour;
    private final boolean isPopular;
    private final Address address;

    // Should not be public if you only want the builder to be accessible to define the object
    // In that cas, pass the builder as parameter
    Bar(String name, int size, int numberOfBeers, boolean hasHappyHour, boolean isPopular, Address address) {
        this.name = name;
        this.size = size;
        this.numberOfBeers = numberOfBeers;
        this.hasHappyHour = hasHappyHour;
        this.isPopular = isPopular;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public int getNumberOfBeers() {
        return numberOfBeers;
    }
    public boolean isHasHappyHour() {
        return hasHappyHour;
    }
    public boolean isPopular() {
        return isPopular;
    }
    public Address getAddress() {
        return address;
    }

    // Allow to use directly "Bar.builder()" instead of "new BarBuilder().builder()"
    public static BarBuilder builder() {
        return new BarBuilder();
    }
}
