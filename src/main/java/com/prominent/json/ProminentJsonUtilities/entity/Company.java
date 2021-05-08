package com.prominent.json.ProminentJsonUtilities.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@ToString
@Entity
public class Company {
    @Id
    public Long companyId;

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
