package entity.user;

import entity.client.Client;
import entity.transaction.Transaction;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name ="users" )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "cod_cl")
    private int codClient;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "creation_date")
    private Date creationDate;
    @Column(name = "status")
    private String status;
    @Column(name = "last_status_date")
    private Date lastStatusDate;

    @OneToOne
   // @JoinColumn(name = "cod_client")
    private Client client;

    @OneToMany(mappedBy = "users")
    private List<Transaction> transaction;
    public User() {

    }

    public User(int id, int codCl, String username, String password, Date creationDate, String status, Date lastStatusDate) {
        this.id = id;
        this.codClient = codClient;
        this.username = username;
        this.password = password;
        this.creationDate = creationDate;
        this.status = status;
        this.lastStatusDate = lastStatusDate;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastStatusDate() {
        return lastStatusDate;
    }

    public void setLastStatusDate(Date lastStatusDate) {
        this.lastStatusDate = lastStatusDate;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", codClient=" + codClient +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", creationDate=" + creationDate +
                ", status='" + status + '\'' +
                ", lastStatusDate=" + lastStatusDate +
                '}';
    }
}
