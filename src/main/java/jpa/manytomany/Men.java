package jpa.manytomany;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "men")
public class Men{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "men_to_hobby",
            joinColumns = @JoinColumn(name = "men_id"), inverseJoinColumns = @JoinColumn(name = "hobby_id"))
    private Set<Hobby> hobbyList;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Hobby> getHobbyList() {
        return hobbyList;
    }

    public void setHobbyList(Set<Hobby> hobbyList) {
        this.hobbyList = hobbyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Men men = (Men) o;

        return name != null ? name.equals(men.name) : men.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
