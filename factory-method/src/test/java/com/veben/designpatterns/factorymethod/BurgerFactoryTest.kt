package com.veben.designpatterns.factorymethod

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import kotlin.test.assertFailsWith

internal class BurgerFactoryTest {

    private var burgerFactory: BurgerFactory? = null

    @BeforeEach
    fun setUp() {
        burgerFactory = BurgerFactory()
    }

    @Test
    fun `calling factory with cheese content should return cheese burger`() {
        // when
        val burger = burgerFactory!!.getBurger(BurgerFactory.CHEESE_BURGER_CONTENT)

        // then
        assert(burger is CheeseBurger)
    }

    @Test
    fun `calling factory with chicken content should return chicken burger`() {
        // when
        val burger = burgerFactory!!.getBurger(BurgerFactory.CHICKEN_BURGER_CONTENT)

        // then
        assert(burger is ChickenBurger)
    }

    @Test
    fun `calling factory with other content should throw illegal argument exception`() {
        // when then
        assertFailsWith<IllegalArgumentException> { burgerFactory!!.getBurger("fish") }
    }
}