package entity.transaction;


import java.util.Date;

public class Transaction {
    private int transactionId;
    private String contDebitat;
    private String contCreditat;
    private String transactionCurrency;
    private Double amount;
    private Date transactionDate;
    private String description;

    public Transaction(){

    }

    public Transaction(int transactionId, String contDebitat, String contCreditat, String transactionCurrency, Double amount, Date transactionDate, String description) {
        this.transactionId = transactionId;
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
                ", contDebitat='" + contDebitat + '\'' +
                ", contCreditat='" + contCreditat + '\'' +
                ", transactionCurrency='" + transactionCurrency + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", description='" + description + '\'' +
                '}';
    }
}
