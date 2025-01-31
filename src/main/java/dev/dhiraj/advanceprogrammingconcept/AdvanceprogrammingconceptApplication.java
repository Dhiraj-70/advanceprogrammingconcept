package dev.dhiraj.advanceprogrammingconcept;

import dev.dhiraj.advanceprogrammingconcept.oops.Instructor;
import dev.dhiraj.advanceprogrammingconcept.oops1.D;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdvanceprogrammingconceptApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvanceprogrammingconceptApplication.class, args);
//        Instructor instructor = new Instructor();
//        System.out.println(instructor);

        D d = new D();
        System.out.println(d);
    }

}
