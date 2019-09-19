package com.slimani.medicospot.model;

import javax.persistence.*;

@Entity(name = "Leave")
public class Leave {

    @OrderColumn

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String begin_leave;

    @Column(nullable = false)
    private String end_leave;

    @ManyToOne
    @JoinColumn(unique = true)
    private Medecin medecin;

    public Leave() {
    }

    public Leave(String begin_leave, String end_leave, Medecin medecin) {
        this.begin_leave = begin_leave;
        this.end_leave = end_leave;
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBegin_leave() {
        return begin_leave;
    }

    public void setBegin_leave(String begin_leave) {
        this.begin_leave = begin_leave;
    }

    public String getEnd_leave() {
        return end_leave;
    }

    public void setEnd_leave(String end_leave) {
        this.end_leave = end_leave;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
