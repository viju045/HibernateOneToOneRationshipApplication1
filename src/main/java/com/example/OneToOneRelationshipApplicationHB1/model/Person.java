package com.example.OneToOneRelationshipApplicationHB1.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "person1")
public class Person {
    @Id
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen",strategy = "foreign", parameters = {@org.hibernate.annotations.Parameter(name = "property",value = "adharCard")})

    private int adharcardId;
    private String  Adderss;
    private String email;
    private String pincode;
    private String mobile;
    @OneToOne
    @PrimaryKeyJoinColumn
    private AdharCard adharCard;

    public AdharCard getAdharCard() {
        return adharCard;
    }

    public void setAdharCard(AdharCard adharCard) {
        this.adharCard = adharCard;
    }

    public String getAdderss() {
        return Adderss;
    }

    public void setAdderss(String adderss) {
        Adderss = adderss;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAdharcardId() {
        return adharcardId;
    }

    public void setAdharcardId(int adharcardId) {
        this.adharcardId = adharcardId;
    }
}
