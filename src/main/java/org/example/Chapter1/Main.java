package org.example.Chapter1;


import config1.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        //here spring is using the configuration class to use its context object so v r sending the config class to spring to use it

        var context=new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot y=context.getBean("parrot1",Parrot.class);
//        System.out.println(y.getName());
//        Parrot p=context.getBean("parrot2",Parrot.class);
//        System.out.println(p.getName());
//

        String s=context.getBean(String.class);

        System.out.println(s);
        Integer i=context.getBean(Integer.class);
        System.out.println(i);
        //here it will take the default bean which i have given has primary so that no need to specify the bean name in parameters if v have multiple bean of same type
        Parrot py=context.getBean(Parrot.class);
        System.out.println(py);
        System.out.println(py.getName());


    }
}