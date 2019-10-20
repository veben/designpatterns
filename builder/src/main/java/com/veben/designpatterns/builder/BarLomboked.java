package com.veben.designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class BarLomboked {
    private final String name;
    private final int size;
    private final int numberOfBeers;
    private final boolean hasHappyHour;
    private final boolean isPopular;
    private final FluentAddress fluentAdress;
}
