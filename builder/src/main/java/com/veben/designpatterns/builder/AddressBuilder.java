package com.veben.designpatterns.builder;

public class AddressBuilder {
    private String country;
    private String city;

    public AddressBuilder country(String country) {
        this.country = country;
        return this;
    }

    public AddressBuilder city(String city) {
        this.city = city;
        return this;
    }

    public Address build() {
        return new Address(country, city);
    }
}
