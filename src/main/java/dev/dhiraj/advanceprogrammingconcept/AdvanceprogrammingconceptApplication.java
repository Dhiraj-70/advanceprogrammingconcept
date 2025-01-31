package dev.dhiraj.advanceprogrammingconcept;

import dev.dhiraj.advanceprogrammingconcept.oops.Instructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvanceprogrammingconceptApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvanceprogrammingconceptApplication.class, args);
        Instructor instructor = new Instructor();
        System.out.println(instructor);
    }

}
