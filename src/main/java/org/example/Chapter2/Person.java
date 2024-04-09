package org.example.Chapter2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
private  String name;
//here v r telling the spring to provide the bean from its context and set the field value to the bean value and spring injects the appropriate value
@Autowired
private final Parrot parrot;
//4th approach


    public Person(Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
