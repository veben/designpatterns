package com.veben.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BarLombokedTest {

    @Test
    void should_build_bar() {
        // given
        String name = "Still";
        String country = "France";
        String city = "Paris";
        int numberOfBeers = 15;
        FluentAddress fluentAddress = (new FluentAddress()
                .country(country)
                .city(city));
        BarLomboked barLomboked = new BarLomboked(name, 100, numberOfBeers, true, true, fluentAddress);

        // when
        BarLomboked barLomboked2 = BarLomboked.builder()
                .name(name)
                .numberOfBeers(numberOfBeers)
                .fluentAdress(fluentAddress)
                .build();

        // then
        assertThat(barLomboked2.getName()).isEqualTo(barLomboked.getName());
        assertThat(barLomboked2.getFluentAdress().country()).isEqualTo(barLomboked.getFluentAdress().country());
    }
}