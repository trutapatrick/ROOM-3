package entity.account;

import java.util.Date;

public class Account {

    private int id;
    private int codClient;
    private String iban;
    private String productType;
    private String currencyType;
    private Date creationDate;
    private Date closingDate;
    private double available;

    public Account() {

    }

    public Account(int id, int codClient, String iban, String productType, String currencyType, Date creationDate, Date closingDate, double available) {

        this.id = id;
        this.codClient = codClient;
        this.iban = iban;
        this.productType = productType;
        this.currencyType = currencyType;
        this.creationDate = creationDate;
        this.closingDate = closingDate;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodClient() {
        return codClient;
    }

    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", codClient=" + codClient +
                ", iban='" + iban + '\'' +
                ", productType='" + productType + '\'' +
                ", currencyType='" + currencyType + '\'' +
                ", creationDate=" + creationDate +
                ", closingDate=" + closingDate +
                ", available=" + available +
                '}';
    }
}
