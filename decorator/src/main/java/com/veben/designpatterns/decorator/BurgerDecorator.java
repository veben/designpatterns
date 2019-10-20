package com.veben.designpatterns.decorator;

abstract class BurgerDecorator implements Burger {

    final protected Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String description() {
        return burger.description();
    }
}
