package entity.client;

import java.util.Date;

public class Client {
    private int codClient;

    private Long id;

    private String firstName;

    private String lastName;

    private Date birthday;

    private String email;

    private int phoneNumber;

    private String county;

    public Client() {
    }

    public int getCodClient() {
        return codClient;
    }

    public Long getId() {
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

    public void setId(Long id) {
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

    public Client(int codClient, Long id, String firstName, String lastName, Date birthday, String email, int phoneNumber, String county) {
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
