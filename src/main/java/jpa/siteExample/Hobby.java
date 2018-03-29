//package jpa.siteExample;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "users_to_hobbies")
//public class Hobby {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int hobbyId;
//
//    @Column(name = "hobby")
//    private String hobby;
//
//    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
//    private User user;
//
//    public int getHobbyId() {
//        return hobbyId;
//    }
//
//    public void setHobbyId(int hobbyId) {
//        this.hobbyId = hobbyId;
//    }
//
//    public String getHobby() {
//        return hobby;
//    }
//
//    public void setHobby(String hobby) {
//        this.hobby = hobby;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//}
