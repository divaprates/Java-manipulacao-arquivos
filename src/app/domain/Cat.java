package app.domain;

import java.io.Serializable;

public class Cat implements Serializable {
    private String name;
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
}
