package com.veben.designpatterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Accessors(fluent = true)
@Getter
@Setter
public class FluentAddress {
    private String country;
    private String city;
}
