package jpa.siteExample;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="userName", nullable = false)
    private String username;

    @Column(name="name", nullable = false)
    private String name;

//    @OneToOne(fetch = FetchType.EAGER, mappedBy = "users", cascade = CascadeType.ALL)
//    private Hobby hobby;
//
//    public Hobby getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(Hobby hobby) {
//        this.hobby = hobby;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
