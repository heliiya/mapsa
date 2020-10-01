package ir.mapsa.demo.controller;

import ir.mapsa.demo.domain.Person;
import ir.mapsa.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("persons")
    public List<Person> persons(){
        return personRepository.findAll();
    }


}
