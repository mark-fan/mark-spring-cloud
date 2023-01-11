package com.mark.app1.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author luofan
 */
@Data
@Builder
public class User {
    private int Id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        Id = id;
        this.name = name;
        this.age = age;
    }
}
