package com.tematihonov;

public class Animal {
    private String name;
    private String color;
    private Habitat habitat;

    public Animal(String name, String color, Habitat habitat) {
        this.name = name;
        this.color = color;
        this.habitat = habitat;
    }

    public void print(){
        System.out.println(name + " " + color + " " + habitat);
    };
}
