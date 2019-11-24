package com.veben.designpatterns.factorymethod

internal class BurgerFactory {

    companion object {
        const val CHEESE_BURGER_CONTENT = "cheese"
        const val CHICKEN_BURGER_CONTENT = "chicken"
    }

    fun getBurger(desiredContent: String): Burger {
        return when(desiredContent) {
            CHEESE_BURGER_CONTENT -> CheeseBurger()
            CHICKEN_BURGER_CONTENT -> ChickenBurger()
            else -> throw IllegalArgumentException("Unknown content")
        }
    }
}
