package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Color {

    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=3, max=10)
    private String name;

    @NotNull
    @Size(min=3, max=10)
    private String color;

    @NotNull
    @Size(min=3, max=10)
    private String description;

    public Color() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
