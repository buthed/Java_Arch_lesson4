package com.tematihonov;

public class Main {

    public static void main(String[] args) {
        Habitat hab = HabitatFactory.getHabitat("Сибирь");
        Animal animal = new Animal("Лиса", "Рыжий", hab);
        animal.print();


    }
}

