package com.local.credits;

import org.springframework.boot.SpringApplication;

public class TestCreditsApplication {

    public static void main(String[] args) {
        SpringApplication.from(CreditsApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
