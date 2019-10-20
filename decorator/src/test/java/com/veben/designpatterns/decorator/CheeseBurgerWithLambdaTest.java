package com.veben.designpatterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CheeseBurgerWithLambdaTest {
    Burger burger;
    CheeseBurger cheeseBurger;

    @BeforeEach
    void setUp() {
        burger = new BurgerImpl();
        cheeseBurger = new CheeseBurger(burger);
    }

    @Test
    void should_add_cheese_description_behaviour_to_burger_but_keep_price_with_lambda() {
        // when
        Burger cheeseBurger = () -> Burger.description + this.cheeseBurger.cheeseDescription();

        // then
        assertThat(cheeseBurger.description()).isEqualTo(Burger.description + this.cheeseBurger.cheeseDescription());

        assertThat(cheeseBurger.price).isNotEqualTo(this.cheeseBurger.price).isEqualTo(1.5);
    }
}
