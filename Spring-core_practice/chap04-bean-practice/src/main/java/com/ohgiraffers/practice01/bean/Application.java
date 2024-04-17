package com.ohgiraffers.practice01.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        SingletonBean singletonBean1 = context.getBean("generateSingletonBean", SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean("generateSingletonBean", SingletonBean.class);
        PrototypeBean prototypeBean1 = context.getBean("generatePrototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean("generatePrototypeBean", PrototypeBean.class);

        System.out.println(singletonBean1.getMessage());
        System.out.println(singletonBean2.getMessage());
        System.out.println(prototypeBean1.getMessage());
        System.out.println(prototypeBean2.getMessage());

    }
}
