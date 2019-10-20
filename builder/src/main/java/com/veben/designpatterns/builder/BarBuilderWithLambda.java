package com.veben.designpatterns.builder;

import java.util.function.Consumer;

public class BarBuilderWithLambda {

    String name;
    int size;
    Address address;
    int numberOfBeers;
    boolean hasHappyHour;
    boolean isPopular;

    // Consumer is a functional interface provided by Java 8, which takes single argument and returns no result.
    // In this case it accepts an object of type BarBuilderWithLambda which is passed to accept method.
    // So the instance of the builder would be accessible in the future lambda expression.
    public BarBuilderWithLambda builder(Consumer<BarBuilderWithLambda> builderFunction) {
        builderFunction.accept(this);
        return this;
    }

    public Bar build() {
        return new Bar(name, size, numberOfBeers, hasHappyHour, isPopular, address);
    }
}
