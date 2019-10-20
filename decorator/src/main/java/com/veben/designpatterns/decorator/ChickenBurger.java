package com.veben.designpatterns.decorator;

public class ChickenBurger extends BurgerDecorator {

    final double price = 3.;

    public ChickenBurger(Burger burger) {
        super(burger);
    }

    @Override
    public String description() {
        return super.description() + chickenDescription();
    }

    String chickenDescription() {
        return " + chicken";
    }
}
