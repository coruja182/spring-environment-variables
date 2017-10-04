package com.github.coruja182.springenvironmentvariables;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEnvironmentVariablesExample {

    public static void main(String[] args) {
        new SpringEnvironmentVariablesExample();
    }

    public SpringEnvironmentVariablesExample() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            "com.github.coruja182.springenvironmentvariables",
            "com.github.coruja182.springenvironmentvariables.service");

        ApplicationProperties bean = context.getBean(ApplicationProperties.class);
        System.out.println(bean.getMyproperty());
    }

}
