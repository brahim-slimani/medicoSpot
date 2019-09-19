package com.slimani.medicospot.model;


import javax.persistence.*;

@Entity(name = "Appointment")
public class Appointment {

    @OrderColumn

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String patient_firstname;

    @Column(nullable = false)
    private String patient_lastname;

    @Column(nullable = false)
    private String patient_sexe;

    @Column(nullable = false)
    private Long patient_age;

    @Column(nullable = false)
    private String patient_phone;

    @Column(nullable = false)
    private String visit_time;

    @Column(nullable = false)
    private String pattern;

    @ManyToOne
    @JoinColumn(unique = true)
    private Medecin medecin;

    public Appointment() {
    }

    public Appointment(String patient_firstname, String patient_lastname, String patient_sexe, Long patient_age, String patient_phone, String visit_time, String pattern, Medecin medecin) {
        this.patient_firstname = patient_firstname;
        this.patient_lastname = patient_lastname;
        this.patient_sexe = patient_sexe;
        this.patient_age = patient_age;
        this.patient_phone = patient_phone;
        this.visit_time = visit_time;
        this.pattern = pattern;
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatient_firstname() {
        return patient_firstname;
    }

    public void setPatient_firstname(String patient_firstname) {
        this.patient_firstname = patient_firstname;
    }

    public String getPatient_lastname() {
        return patient_lastname;
    }

    public void setPatient_lastname(String patient_lastname) {
        this.patient_lastname = patient_lastname;
    }

    public String getPatient_sexe() {
        return patient_sexe;
    }

    public void setPatient_sexe(String patient_sexe) {
        this.patient_sexe = patient_sexe;
    }

    public Long getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(Long patient_age) {
        this.patient_age = patient_age;
    }

    public String getPatient_phone() {
        return patient_phone;
    }

    public void setPatient_phone(String patient_phone) {
        this.patient_phone = patient_phone;
    }

    public String getVisit_time() {
        return visit_time;
    }

    public void setVisit_time(String visit_time) {
        this.visit_time = visit_time;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
