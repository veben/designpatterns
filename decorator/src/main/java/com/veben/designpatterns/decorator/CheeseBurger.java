package com.veben.designpatterns.decorator;

class CheeseBurger extends BurgerDecorator {

    final double price = 2.5;

    public CheeseBurger(Burger burger) {
        super(burger);
    }

    @Override
    public String description() {
        return super.description() + cheeseDescription();
    }

    String cheeseDescription() {
        return " + cheese";
    }
}
