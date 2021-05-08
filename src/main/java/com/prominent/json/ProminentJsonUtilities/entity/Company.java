package com.prominent.json.ProminentJsonUtilities.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@ToString
@Entity
public class Company {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String companyId;

    public String name;
    public String size;
    public String id;
    public String founded;
    public String industry;
    @OneToOne(cascade = CascadeType.ALL)
    public Location location;
    public String linkedin_url;
    public String linkedin_id;
    public String facebook_url;
    public String twitter_url;
    public String website;
}
