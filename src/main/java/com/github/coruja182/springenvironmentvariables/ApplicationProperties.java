package com.github.coruja182.springenvironmentvariables;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

    @Value("${myproperty}")
    private String myproperty;

    public ApplicationProperties() {
        System.out.println(getClass().getSimpleName());
    }

    public String getMyproperty() {
        return myproperty;
    }

    public void setMyproperty(String myproperty) {
        this.myproperty = myproperty;
    }
}
