package com.veben.designpatterns.factorymethod

class CheeseBurger : Burger {
    override val content: String
        get() = "cheese"
}
