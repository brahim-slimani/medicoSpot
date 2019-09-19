package com.slimani.medicospot.model;


import javax.persistence.*;

@Entity(name = "Service")
public class Service {

    @OrderColumn

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String designation;

    @ManyToOne
    @JoinColumn(unique = true)
    private Medecin medecin;

    public Service() {
    }

    public Service(String designation, Medecin medecin) {
        this.designation = designation;
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
