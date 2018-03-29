package jpa.manytomanyspringdata;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "hobby")
public class Hobby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hobby", unique = true, nullable = false)
    private String name;

    @ManyToMany(mappedBy = "hobbyList", fetch = FetchType.LAZY)
    private Set<Men> menSet = new HashSet<>();

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

    public Set<Men> getMenSet() {
        return menSet;
    }

    public void setMenSet(Set<Men> menSet) {
        this.menSet = menSet;
    }
}
