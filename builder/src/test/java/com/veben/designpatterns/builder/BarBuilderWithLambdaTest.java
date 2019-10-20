package com.veben.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BarBuilderWithLambdaTest {

    @Test
    void should_build_bar() {
        // given
        String name = "Still";
        String country = "France";
        int numberOfBeers = 15;
        Address address = Address.builder().country(country).build();
        Bar bar = new Bar(name, 100, numberOfBeers, true, true, address);

        // when
        Bar bar2 = new BarBuilderWithLambda()
                .builder($ -> {
                    $.name = name;
                    $.numberOfBeers = numberOfBeers;
                }).builder($ -> $.hasHappyHour = true)
                .builder($ -> $.address = address)
                .build();

        // then
        assertThat(bar2.getName()).isEqualTo(bar.getName());
        assertThat(bar2.getAddress().getCountry()).isEqualTo(bar.getAddress().getCountry());
    }
}