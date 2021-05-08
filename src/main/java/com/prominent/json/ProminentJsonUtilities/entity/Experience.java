package com.prominent.json.ProminentJsonUtilities.entity;


import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Data
@ToString
@Entity
public class Experience {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String experienceId;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private Set<Company> coachGroups = new TreeSet<>();
    public String start_date;
    public String end_date;
    @OneToOne(cascade = CascadeType.ALL)
    public Title title;
    @ElementCollection(targetClass=String.class)
    public List<String> location_names;
    public boolean is_primary;
    public String summary;
}
