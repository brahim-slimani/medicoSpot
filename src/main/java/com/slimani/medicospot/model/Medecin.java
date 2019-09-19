package com.slimani.medicospot.model;

import javax.persistence.*;
import java.util.Set;

@Entity (name = "Medecin")
public class Medecin {

    @OrderColumn

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastanme;

    @Column(nullable = false)
    private String speciality;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private double longitude;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double visit_price;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = true)
    private String email;

    @OneToOne(mappedBy = "medecin", cascade = CascadeType.ALL)
    private Worktime worktime;

    @OneToOne(mappedBy = "medecin", cascade = CascadeType.ALL)
    private Band band;

    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Service> services;

    @OneToMany(mappedBy = "medecin", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Leave> leaves;


    public Medecin() {
    }

    public Medecin(String firstname, String lastanme, String speciality, String address, double longitude, double latitude, double visit_price, String phone, String email, Worktime worktime, Band band, Set<Service> services, Set<Leave> leaves) {
        this.firstname = firstname;
        this.lastanme = lastanme;
        this.speciality = speciality;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
        this.visit_price = visit_price;
        this.phone = phone;
        this.email = email;
        this.worktime = worktime;
        this.band = band;
        this.services = services;
        this.leaves = leaves;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastanme() {
        return lastanme;
    }

    public void setLastanme(String lastanme) {
        this.lastanme = lastanme;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getVisit_price() {
        return visit_price;
    }

    public void setVisit_price(double visit_price) {
        this.visit_price = visit_price;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Worktime getWorktime() {
        return worktime;
    }

    public void setWorktime(Worktime worktime) {
        this.worktime = worktime;
    }

    public Band getband() {
        return band;
    }

    public void setband(Band band) {
        this.band = band;
    }

    public Set<Service> getServices() {
        return services;
    }

    public void setServices(Set<Service> services) {
        this.services = services;
    }

    public Set<Leave> getLeaves() {
        return leaves;
    }

    public void setLeaves(Set<Leave> leaves) {
        this.leaves = leaves;
    }
}
