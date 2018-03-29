package borisov.springdata;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Speaker {
    @Id
    @GeneratedValue
    private Long speakerId;

    private String name;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Talk> talks;

    public Speaker() {
    }

    public Speaker(String name) {
        this.name = name;
    }

    public void addTalk(Talk talk) {
        if (talks == null) {
            talks = new HashSet<Talk>();
        }
        talks.add(talk);
    }

    public String getName() {
        return name;
    }

    public Set<Talk> getTalks() {
        return talks;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "speakerId=" + speakerId +
                ", name='" + name + '\'' +
                '}';
    }
}
