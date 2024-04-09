package config2;

import org.example.Chapter2.Parrot;
import org.example.Chapter2.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.Chapter2")
public class ProjectConfig {
    @Bean
    public Parrot parrot(){
        Parrot p=new Parrot();
        p.setName("shushu");
        return p;
    }
    //wiring of bean taking place means linking b/w the different beans person and parrot
    //here parrot bean is not created twice coz once the bean parrot created after in the person bean spring autpmatically take the bean from the context and uses it and it wil; not create again
    // if the parrot bean is not existing then spring creates it and adds to it context and return the value where it has been called
    //calling the bean method inside the other bean to bind them is called wiring

//    @Bean
//    public Person person(){
//        Person p=new Person();
//        p.setName("yashu");
//        p.setParrot(parrot());
//        return p;
//    }

    //2nd approach
    //in this v r passing arguments to the function v r telling the spring to give the necessary bean that has been declared in the arguments from its context
    //then spring injects the bean parrot as a parameter this is called di(dependency injection)
    //means framework setting the value into the parameter or specified field and di is applicartion of ioc
    //ioc means framework controls the application under execution
//    @Bean
//    public Person person(Parrot parrot){
//        Person p=new Person();
//        p.setName("yashu");
//        p.setParrot(parrot);
//        return p;
//    }
    //3rd aproach
//    @Bean
//    public Person person(){
//        Person p=new Person();
//        p.setName("yashu");
//        return p;
//    }
    @Bean
    public Person person(){
        Person p=new Person(parrot());
        p.setName("yashu");
        return p;
    }

}
