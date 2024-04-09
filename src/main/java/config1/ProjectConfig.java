package config1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//configurartion class is used to instruct spring to do some special actions defined in it

@Configuration
@ComponentScan(basePackages = "org.example.Chapter1")
//v told spring which class to add an instance by specifying the component over the class
// v also told the where to look for those classes by component class
public class ProjectConfig {
    //in java most of the time verb is used as a method name but here v dont use that coz they reperesent the object instances they return and now they will be part of the spring context
    //method name==bean name
    //here v r telling the spring the object instance that needs to become bean
    //v dont need the methods anymore
//@Bean
//@Primary
//    Parrot parrot1(){
//    var p=new Parrot();
//    p.setName("shushu");
//    return p;
//}


//if v want to change the bean name v want v can do that by @Bean("preethu") or Bean(name="preethu")or Bean(value="preethu")
//    @Bean
//    Parrot parrot2(){
//        var p=new Parrot();
//        p.setName("peethu");
//        return p;
//    }
@Bean
    String hello(){
    return "Hello";
}
@Bean
    Integer ten(){
    return 10;
}
}
