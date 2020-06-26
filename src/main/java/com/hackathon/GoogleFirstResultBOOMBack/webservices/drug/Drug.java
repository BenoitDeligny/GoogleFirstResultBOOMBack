package com.hackathon.GoogleFirstResultBOOMBack.webservices.drug;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hackathon.GoogleFirstResultBOOMBack.webservices.prescription.Prescription;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    private Date startingDate;

    private Date endingDate;

    private int takePerDay;

    @ElementCollection
    private List<String> moments = new ArrayList<>();

    @JsonBackReference
    @ManyToOne
    private Prescription prescription;

    public Drug() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public int getTakePerDay() {
        return takePerDay;
    }

    public void setTakePerDay(int takePerDay) {
        this.takePerDay = takePerDay;
    }

    public List<String> getMoments() {
        return moments;
    }

    public void setMoments(List<String> moments) {
        this.moments = moments;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
