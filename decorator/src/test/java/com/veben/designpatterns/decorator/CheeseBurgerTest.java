package com.veben.designpatterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CheeseBurgerTest {

    Burger burger;
    Burger cheeseBurger;
    CheeseBurger cheeseBurger2;

    @BeforeEach
    void setUp() {
        burger = new BurgerImpl();
        cheeseBurger = new CheeseBurger(burger);
        cheeseBurger2 = new CheeseBurger(burger);
    }

    @Test
    void should_return_burger_interface_description_plus_cheese_description() {
        assertThat(cheeseBurger.description()).isEqualTo(Burger.description + " + cheese");
        System.out.println(cheeseBurger.description());
        assertThat(cheeseBurger2.description()).isEqualTo(Burger.description + cheeseBurger2.cheeseDescription());
        System.out.println(cheeseBurger2.description());
    }
}