package com.slimani.medicospot.model;


import javax.persistence.*;

@Entity(name = "Band")
public class Band {

    @OrderColumn

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String disponibilty;

    @OneToOne
    @JoinColumn(unique = true)
    private Medecin medecin;

    public Band() {
    }

    public Band(String disponibilty, Medecin medecin) {
        this.disponibilty = disponibilty;
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDisponibilty() {
        return disponibilty;
    }

    public void setDisponibilty(String disponibilty) {
        this.disponibilty = disponibilty;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
