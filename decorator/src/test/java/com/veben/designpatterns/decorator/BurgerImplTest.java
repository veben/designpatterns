package com.veben.designpatterns.decorator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BurgerImplTest {

    Burger burger;
    BurgerImpl burger2;

    @BeforeEach
    void setUp() {
        burger = new BurgerImpl();
        burger2 = new BurgerImpl();
    }

    @Test
    void should_return_burger_interface_description() {
        assertThat(burger.description()).isEqualTo(Burger.description);
        assertThat(burger2.description()).isEqualTo(Burger.description);
    }
}