package com.hackathon.GoogleFirstResultBOOMBack.webservices.prescription;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hackathon.GoogleFirstResultBOOMBack.webservices.drug.Drug;
import com.hackathon.GoogleFirstResultBOOMBack.webservices.applicationUser.ApplicationUser;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dateCreation;

    @Column(nullable = false)
    private String author;

    @JsonBackReference
    @ManyToOne
    private ApplicationUser user;

    @OneToMany(mappedBy = "prescription", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Drug> drugs = new ArrayList<>();

    public Prescription() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ApplicationUser getUser() {
        return user;
    }

    public void setUser(ApplicationUser user) {
        this.user = user;
    }

    public List<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(List<Drug> drugs) {
        this.drugs = drugs;
    }
}
