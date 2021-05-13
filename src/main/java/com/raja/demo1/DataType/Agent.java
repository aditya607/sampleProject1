package com.raja.demo1.DataType;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Agent {
    private String name;
    private String city;
    private int age;
}