package entity.client;

import entity.account.Account;
import entity.user.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_client")
    private int codClient;
    @Column(name ="id")
    private Double id;
    @Column(name = "firsname")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "dateOfBirth")
    private Date birthday;
    @Column(name = "email")
    private String email;
    @Column(name = "phoneNumber")
    private int phoneNumber;
    @Column(name = "county")
    private String county;

    @OneToOne(mappedBy = "clients")
    private User user;

    @OneToMany(mappedBy = "accounts", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Account> accounts;

    public Client() {
    }

    public int getCodClient() {
        return codClient;
    }

    public Double getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCounty() {
        return county;
    }

    public void setCodClient(int codClient) {
        this.codClient = codClient;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "Client{" +
                "codClient=" + codClient +
                ", id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", county='" + county + '\'' +
                '}';
    }

    public Client(int codClient, Double id, String firstName, String lastName, Date birthday, String email, int phoneNumber, String county) {
        this.codClient = codClient;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.county = county;
    }

}
