package entity.transaction;


import entity.user.User;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name ="transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;
    @Column(name = "username")
    private String username;
    @Column(name = "cont_debitat")
    private String contDebitat;
    @Column(name = "cont_creditat")
    private String contCreditat;
    @Column(name = "tr_currency")
    private String transactionCurrency;
    @Column(name = "amount")
    private Double amount;
    @Column(name = "tr_date")
    private Date transactionDate;
    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    public Transaction() {

    }

    public Transaction(int transactionId, String username, String contDebitat, String contCreditat, String transactionCurrency, Double amount, Date transactionDate, String description) {
        this.transactionId = transactionId;
        this.username = username;
        this.contDebitat = contDebitat;
        this.contCreditat = contCreditat;
        this.transactionCurrency = transactionCurrency;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.description = description;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContDebitat() {
        return contDebitat;
    }

    public void setContDebitat(String contDebitat) {
        this.contDebitat = contDebitat;
    }

    public String getContCreditat() {
        return contCreditat;
    }

    public void setContCreditat(String contCreditat) {
        this.contCreditat = contCreditat;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", username='" + username + '\'' +
                ", contDebitat='" + contDebitat + '\'' +
                ", contCreditat='" + contCreditat + '\'' +
                ", transactionCurrency='" + transactionCurrency + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", description='" + description + '\'' +
                '}';
    }

}
