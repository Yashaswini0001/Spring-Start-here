package org.example.Chapter2;

public class Parrot {
    private String name;

    public Parrot() {
        System.out.println("first call");
    }

    public String toString(){
        return "Parrot:"+name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
