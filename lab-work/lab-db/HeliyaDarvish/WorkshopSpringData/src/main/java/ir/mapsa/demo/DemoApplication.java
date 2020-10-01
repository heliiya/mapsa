package ir.mapsa.demo;

import ir.mapsa.demo.domain.Person;
import ir.mapsa.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Autowired
    PersonRepository personRepository;

    @Override
    public void run(String... args) throws Exception {
        personRepository.save(new Person(1,"heli","dari","09365526985"));
        personRepository.save(new Person(1,"heli","dari","09365526985"));
        personRepository.save(new Person(1,"heli","dari","09365526985"));
        personRepository.save(new Person(1,"heli","dari","09365526985"));
    }
}
