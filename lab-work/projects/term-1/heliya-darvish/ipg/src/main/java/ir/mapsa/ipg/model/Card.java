package ir.mapsa.ipg.model;

import java.util.Date;

public class Card {
    private long cardNo;
    private long secondPass;
    private int cvv2;
    private Date expirationDate;
    private Long balance;

    public Card(int cardNo, int secondPass, int cvv2, Date expirationDate) {
        this.cardNo = cardNo;
        this.secondPass = secondPass;
        this.cvv2 = cvv2;
        this.expirationDate = expirationDate;
        this.balance = 10000L;
    }

    public long getCardNo() {
        return cardNo;
    }

    public long getSecondPass() {
        return secondPass;
    }

    public int getCvv2() {
        return cvv2;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public Long getBalance() {
        return balance;
    }
}
