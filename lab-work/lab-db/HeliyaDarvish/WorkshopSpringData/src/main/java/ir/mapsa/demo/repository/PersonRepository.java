package ir.mapsa.demo.repository;

import ir.mapsa.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface PersonRepository extends JpaRepository<Person,Integer> {
}
