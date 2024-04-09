package org.example.Chapter2;

import config2.ProjectConfig;
import org.example.Chapter2.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot parrot=context.getBean(Parrot.class);
//        System.out.println(parrot);
        Person person=context.getBean(Person.class);
        System.out.println(person);
        System.out.println(person.getParrot());

    }
}
