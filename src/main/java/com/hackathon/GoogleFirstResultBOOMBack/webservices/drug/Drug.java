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

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Date startingDate;

    @Column(nullable = false)
    private Date endingDate;

    @Column(nullable = false)
    private int takePerDay;

    @ElementCollection
    @Column(nullable = false)
    private List<String> moments = new ArrayList<String>();

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
