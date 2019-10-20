package com.veben.designpatterns.builder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddressBuilderTest {

    @Test
    void should_build_the_address() {
        // given
        String country = "France";
        String city = "Paris";

        // when
        Address address = Address.builder()
                .country(country)
                .city(city)
                .build();

        // then
        assertThat(address.getCountry()).isEqualTo(country);
        assertThat(address.getCity()).isEqualTo(city);
    }
}