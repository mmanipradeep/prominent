package com.prominent.json.ProminentJsonUtilities.entity;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@ToString
@Entity
public class Root {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String id;
    public String full_name;
    public String first_name;
    public String middle_initial;
    public String middle_name;
    public String last_name;
    public String gender;
    public Integer birth_year;
    public Integer birth_date;
    public String linkedin_url;
    public String linkedin_username;
    public String linkedin_id;
    public String facebook_url;
    public String facebook_username;
    public String facebook_id;
    public String twitter_url;
    public String twitter_username;
    public String github_url;
    public String github_username;
    public String work_email;
    public Integer mobile_phone;
    public String industry;
    public String job_title;
    public String job_title_role;
    public String job_title_sub_role;

    @ElementCollection(targetClass=String.class)
    public List<String> job_title_levels;
    public String job_company_id;
    public String job_company_name;
    public String job_company_website;
    public String job_company_size;
    public String job_company_founded;
    public String job_company_industry;
    public String job_company_linkedin_url;
    public String job_company_linkedin_id;
    public String job_company_facebook_url;
    public String job_company_twitter_url;
    public String job_company_location_name;
    public String job_company_location_locality;
    public String job_company_location_region;
    public String job_company_location_geo;
    public String job_company_location_street_address;
    public String job_company_location_address_line_2;
    public String job_company_location_postal_code;
    public String job_company_location_country;
    public String job_company_location_continent;
    public String job_last_updated;
    public String job_start_date;
    public String job_summary;
    public String location_name;
    public String location_locality;
    public String location_region;
    public String location_country;
    public String location_continent;
    public String location_street_address;
    public String location_address_line_2;
    public String location_postal_code;
    public String location_geo;
    public String location_last_updated;
    public String inferred_salary;
    public int inferred_years_experience;
    public String summary;
    @ElementCollection(targetClass=String.class)
    public List<String> phone_numbers;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Email> emails;
    @ElementCollection(targetClass=String.class)
    public List<String> interests;
    @ElementCollection(targetClass=String.class)
    public List<String> skills;
    @ElementCollection(targetClass=String.class)
    public List<String> location_names;
    @ElementCollection(targetClass=String.class)
    public List<String> regions;
    @ElementCollection(targetClass=String.class)
    public List<String> countries;
    @ElementCollection(targetClass=String.class)
    public List<String> street_addresses;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Experience> experience;
    @ElementCollection(targetClass=String.class)
    public List<String> education;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Profile> profiles;
    @OneToOne(cascade = CascadeType.ALL)
    public VersionStatus version_status;
}
