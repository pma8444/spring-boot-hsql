package ch.pma;

import ch.pma.controller.ApplicationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHsqlMain implements CommandLineRunner {

    @Autowired
    ApplicationController applicationController;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootHsqlMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        applicationController.init();
    }
}
