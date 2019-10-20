package com.veben.designpatterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ChickenCheeseBurgerTest {
    Burger burger;
    ChickenBurger chickenBurger;
    CheeseBurger cheeseBurger;

    @BeforeEach
    void setUp() {
        burger = new BurgerImpl();
        chickenBurger = new ChickenBurger(burger);
    }

    @Test
    void should_add_cheese_description_behaviour_to_chicken_burger_but_keep_price() {
        // when
        cheeseBurger = new CheeseBurger(chickenBurger);

        // then
        assertThat(cheeseBurger.description()).isEqualTo(
                Burger.description +
                chickenBurger.chickenDescription() +
                cheeseBurger.cheeseDescription());
        System.out.println(cheeseBurger.description());

        // and
        assertThat(cheeseBurger.price).isNotEqualTo(chickenBurger.price).isEqualTo(2.5);
        System.out.println(cheeseBurger.price);
    }
}
