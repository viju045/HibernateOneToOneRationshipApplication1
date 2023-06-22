package com.example.OneToOneRelationshipApplicationHB1.model;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name =" adharcard1")
public class AdharCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int adharcardId;
    @OneToOne(mappedBy = "adharCard")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private Person person;

    private String Agency;
    private String IssueTime;
    private String type;

    public int getAdharcardId() {
        return adharcardId;
    }

    public void setAdharcardId(int adharcardId) {
        this.adharcardId = adharcardId;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        Agency = agency;
    }

    public String getIssueTime() {
        return IssueTime;
    }

    public void setIssueTime(String issueTime) {
        IssueTime = issueTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPerson(Person person) {
    }
}
