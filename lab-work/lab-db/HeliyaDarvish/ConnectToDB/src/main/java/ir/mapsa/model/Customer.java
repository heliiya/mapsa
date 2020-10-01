package ir.mapsa.model;

import ir.mapsa.persistence.Column;
import ir.mapsa.persistence.Entity;
import ir.mapsa.persistence.Id;
import ir.mapsa.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
    @Id
    @Column(name = "ID", dataType = "NUMBER", length = 10)
    private long id;
    @Column(name = "FIRST_NAME", dataType = "VARCHAR", length = 30)
    private String firstName;
    @Column(name = "LAST_NAME", dataType = "VARCHAR", length = 30)
    private String lastName;

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                firstName.equals(customer.firstName) &&
                lastName.equals(customer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}