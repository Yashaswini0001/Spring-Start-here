package org.example.Chapter1;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
//in st only one instance of the class is added to context
 //whereas in other v can add as many instances v needed
//sterotype annotation(st annot)
//component tells the spring to mark the class and to add the instances to its context so need to explicitly define the objects as bean
//but spring doesnt directly search for st annot classes so to do that v will tell spring to search for st by using component scan annot over config class
//in component scan v will specify spring where it should look for
public class Parrot {

    private String name;
// post construct will call the specified method after the bean creation but whereas in the other case it was not happening so to do so it is used 
    @PostConstruct
    public void init(){
        this.name="yashu";
    }
    public void setName(String name) {
    this.name =name;
    }

    public String getName() {
    return name;
    }
}
