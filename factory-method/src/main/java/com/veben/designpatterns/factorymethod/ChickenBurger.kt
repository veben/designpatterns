package com.veben.designpatterns.factorymethod

class ChickenBurger : Burger {
    override val content: String
        get() = "chicken"
}
