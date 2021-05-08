package com.prominent.json.ProminentJsonUtilities.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Data
@ToString
@Entity
public class Title {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String titleId;
    public String name;
    public String role;
    public String sub_role;
    @ElementCollection(targetClass=String.class)
    public List<String> levels;
}
