package ir.mapsa.ipg.model;

import java.util.List;

public class Customer {
    private Long nationalCode;
    private String firstName;
    private String lastName;
    private List<Card> cards;
    private String email;

    public Customer(Long nationalCode, String firstName, String lastName, List<Card> cards, String email) {
        this.nationalCode = nationalCode;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cards = cards;
        this.email = email;
    }

    public Long getNationalCode() {
        return nationalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Card> getCards() {
        return cards;
    }

    public String getEmail() {
        return email;
    }
}
