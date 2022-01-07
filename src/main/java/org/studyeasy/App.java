package org.studyeasy;

import org.studyeasy.interfaces.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
//        Car swift = new Swift();
//        Car corolla = new Corolla();
//        System.out.println(swift.org.studyeasy.specs());
//        System.out.println(corolla.org.studyeasy.specs());
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car swift = context.getBean("swift",Car.class);
        Car corolla = context.getBean("corolla",Car.class);
        System.out.println(swift.specs());
        System.out.println(corolla.specs());
        context.close();
    }
}
