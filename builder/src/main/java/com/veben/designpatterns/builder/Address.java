package com.veben.designpatterns.builder;

public class Address {
    private final String country;
    private final String city;

    Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public String getCity() {
        return city;
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }
}
