package com.veben.designpatterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChickenBurgerTest {

    Burger burger;
    ChickenBurger chickenBurger;

    @BeforeEach
    void setUp() {
        burger = new BurgerImpl();
        chickenBurger = new ChickenBurger(burger);
    }

    @Test
    void should_return_burger_interface_description_plus_chicken_description() {
        assertThat(chickenBurger.description()).isEqualTo(Burger.description + chickenBurger.chickenDescription());
    }
}