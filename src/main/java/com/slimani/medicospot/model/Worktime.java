package com.slimani.medicospot.model;



import javax.persistence.*;

@Entity(name = "Worktime")
public class Worktime {

    @OrderColumn

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String begin_day;

    @Column(nullable = false)
    private String end_day;

    @Column(nullable = false)
    private String begin_hour;

    @Column(nullable = false)
    private String end_hour;

    @OneToOne
    @JoinColumn(unique = true)
    private Medecin medecin;

    public Worktime() {
    }

    public Worktime(String begin_day, String end_day, String begin_hour, String end_hour, Medecin medecin) {
        this.begin_day = begin_day;
        this.end_day = end_day;
        this.begin_hour = begin_hour;
        this.end_hour = end_hour;
        this.medecin = medecin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBegin_day() {
        return begin_day;
    }

    public void setBegin_day(String begin_day) {
        this.begin_day = begin_day;
    }

    public String getEnd_day() {
        return end_day;
    }

    public void setEnd_day(String end_day) {
        this.end_day = end_day;
    }

    public String getBegin_hour() {
        return begin_hour;
    }

    public void setBegin_hour(String begin_hour) {
        this.begin_hour = begin_hour;
    }

    public String getEnd_hour() {
        return end_hour;
    }

    public void setEnd_hour(String end_hour) {
        this.end_hour = end_hour;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
